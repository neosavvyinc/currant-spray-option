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

// we don't implement our route structure directly in the service actor because
// we want to be able to test it independently, without having to spin up an actor
class SportServiceActor extends Actor with SportService {

  // the HttpService trait defines only one abstract member, which
  // connects the services environment to the enclosing actor or test
  def actorRefFactory = context

  // this actor only runs our route, but you could add
  // other things here, like request stream processing
  // or timeout handling
  def receive = runRoute(sportRoute)
}


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
    path("sports") {
      get {
        respondWithMediaType(`application/json`) {
          complete {
            swrite(sports);
          }
        }
      } ~
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
    }
}