package com.currant.ds.game

import spray.http._
import MediaTypes._
import com.currant.model.{Game, GameCreateRequest}
import org.json4s.native.Serialization.{write => swrite, _}

import org.json4s._
import com.example.DataHttpService
//import com.currant.model.GameCreateRequest

trait GameEndpoint extends DataHttpService {

  implicit val formats = native.Serialization.formats(NoTypeHints)

  val gameDataService = GameService(db)

  val gameRoute =
    pathPrefix("games") {
      get {
        respondWithMediaType(`application/json`) {
          complete {
            swrite(gameDataService.getAll)
          }
        }
      } ~
      post {
        respondWithMediaType(`application/json`) {
          entity(as[String]) { game =>
            complete {
              val gameObj = read[GameCreateRequest](game)
              swrite(gameDataService.create(gameObj))
            }
          }
        }
      } ~
        path(IntNumber) { id =>
          get {
            respondWithMediaType(`application/json`) {
              complete {
                swrite(gameDataService.get(id))
              }
            }
          } ~
          put {
            respondWithMediaType(`application/json`) {
              entity(as[String]) { game =>
                complete {
                  val gameObj = read[GameCreateRequest](game)
                  swrite(gameDataService.update(gameObj))
                }
              }
            }
          } ~
          delete {
             respondWithMediaType(`application/json`) {
              complete {
                gameDataService.delete(List(id))
                StatusCodes.OK
              }
            }
          }
        }
    }
}
