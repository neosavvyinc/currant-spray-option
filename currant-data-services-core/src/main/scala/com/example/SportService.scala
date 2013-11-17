package com.example

import akka.actor.Actor
import spray.routing._
import spray.http._
import spray.httpx.encoding._
import MediaTypes._
import com.currant.model.Sport
import org.json4s.native.Serialization.{read, write => swrite}

import org.json4s._
import org.json4s.native.JsonMethods._
import org.json4s.JsonDSL._

// this trait defines our service behavior independently from the service actor
trait SportService extends HttpService {

  implicit val formats = native.Serialization.formats(NoTypeHints)

  var sports = List(
    new Sport(
      1L,
      "Baseball",
      "Ya know with a bat",
      true,
      None,
      None,
      None,
      None
    ),
    new Sport(
      2L,
      "Soccer",
      "Ya know with a ball",
      true,
      None,
      None,
      None,
      None
    ))

  val sportRoute =
    pathPrefix("sports") {
      get {
        respondWithMediaType(`application/json`) {
          complete {
            swrite(sports);
          }
        }
      } ~
      path("new") {
        post {
          respondWithMediaType(`application/json`) {
            entity(as[String]) { sport =>
              complete {
                System.out.println(sport);
                val sportObj = read[Sport](sport)
                sports = sports :+ sportObj
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
              swrite(sports.filter(x => x.id != id));
            }
          }
        } ~
        delete {
          respondWithMediaType(`application/json`) {
            complete {
              sports = sports.filter(x => x.id != id)
              StatusCodes.OK
            }
          }
        }

      }
    }
}