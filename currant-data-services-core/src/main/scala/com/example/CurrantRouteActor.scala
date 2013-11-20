package com.example

import akka.actor.{Props, Actor}
import org.json4s.{NoTypeHints, native}
import com.currant.ds.db.DB
import spray.http.MediaTypes._
import org.json4s.native.Serialization._
import com.currant.model.{Sport, SportCreateRequest}
import spray.http.StatusCodes
import org.json4s.native.Serialization.{read, write => swrite}
import spray.routing.HttpService
import com.currant.ds.services.SportsDataService

/**
 * Created by Neosavvy
 *
 * User: adamparrish
 * Date: 11/16/13
 * Time: 4:53 PM
 */

class CurrantRouteActor(val sportDataService : SportsDataService) extends Actor with HttpService {
  // the HttpService trait defines only one abstract member, which
  // connects the services environment to the enclosing actor or test
  def actorRefFactory = context



  val sportRoute =
    pathPrefix("sports") {
      get {
        respondWithMediaType(`application/json`) {
          complete {
            swrite(sportDataService.getAll)
          }
        }
      } ~
        put {
          respondWithMediaType(`application/json`) {
            entity(as[String]) { sport =>
              complete {
                val sportObj = read[SportCreateRequest](sport)
                swrite(sportDataService.create(sportObj))
              }
            }
          }
        } ~
        post {
          respondWithMediaType(`application/json`) {
            entity(as[String]) { sport =>
              complete {
                val sportObj = read[Sport](sport)
                swrite(sportDataService.update(sportObj))
              }
            }
          }
        } ~
        path(IntNumber) { id =>
          get {
            respondWithMediaType(`application/json`) {
              complete {
                StatusCodes.OK
              }
            }
          } ~
            delete {
              respondWithMediaType(`application/json`) {
                complete {
                  sportDataService.delete(List(id))
                  StatusCodes.OK
                }
              }
            }

        }
    }

  // this actor only runs our route, but you could add
  // other things here, like request stream processing
  // or timeout handling
  def receive = runRoute(
    sportRoute/* ~
    gameRoute*/
  )

  override implicit val formats = native.Serialization.formats(NoTypeHints)
}
