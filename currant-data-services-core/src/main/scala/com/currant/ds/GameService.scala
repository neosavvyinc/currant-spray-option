package com.currant.ds

import spray.routing._
import spray.http._
import MediaTypes._
import com.currant.model.Game
import org.json4s.native.Serialization.{read, write => swrite}

import org.json4s._

// this trait defines our service behavior independently from the service actor
trait GameService extends HttpService {

  implicit val formats = native.Serialization.formats(NoTypeHints)

  var games = List(
    new Game(
      1L,
      "Baseball",
      "Ya know with a bat",
      true,
      None,
      None,
      None,
      None
    ),
    new Game(
      2L,
      "Soccer",
      "Ya know with a ball",
      true,
      None,
      None,
      None,
      None
    ))

  val gameRoute =
    pathPrefix("games") {
      get {
        respondWithMediaType(`application/json`) {
          complete {
            swrite(games);
          }
        }
      } ~
        path("new") {
          post {
            respondWithMediaType(`application/json`) {
              entity(as[String]) { sport =>
                complete {
                  System.out.println(sport);
                  val sportObj = read[Game](sport)
                  games = games :+ sportObj
                  StatusCodes.OK
                }
              }
            }
          }
        } ~
        path(IntNumber) { id =>
          get {
            respondWithMediaType(`application/json`) {
              complete {
                swrite(games.filter(x => x.id != id));
              }
            }
          } ~
            delete {
              respondWithMediaType(`application/json`) {
                complete {
                  games = games.filter(x => x.id != id)
                  StatusCodes.OK
                }
              }
            }

        }
    }
}