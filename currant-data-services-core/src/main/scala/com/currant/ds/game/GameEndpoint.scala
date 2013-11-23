package com.currant.ds.game

import spray.http._
import spray.json._
import spray.httpx.SprayJsonSupport._
import MediaTypes._
import com.currant.model.{Game, GameCreateRequest}

import com.example.DataHttpService

object GameEndpointProtocol extends DefaultJsonProtocol {
  implicit val gameFormat = jsonFormat6(Game)
  implicit val gameCreateFormat = jsonFormat5(GameCreateRequest)
}

trait GameEndpoint extends DataHttpService {

  import GameEndpointProtocol._

  val gameDataService = GameService(db)

  val gameRoute =
    pathPrefix("games") {
      get {
        respondWithMediaType(`application/json`) {
          complete {
            //gameDataService.getAll
            HttpResponse(200)
          }
        }
      } ~
      post {
        respondWithMediaType(`application/json`) {
          entity(as[GameCreateRequest]) { game =>
            complete {
              gameDataService.create(game)
            }
          }
        }
      } ~
        path(IntNumber) { id =>
          get {
            respondWithMediaType(`application/json`) {
              complete {
                gameDataService.get(id)
              }
            }
          } ~
          put {
            respondWithMediaType(`application/json`) {
              entity(as[GameCreateRequest]) { game =>
                complete {
                  gameDataService.update(game)
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
