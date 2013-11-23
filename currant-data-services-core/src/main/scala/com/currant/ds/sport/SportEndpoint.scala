package com.currant.ds.sport

import spray.http._
import MediaTypes._
import com.currant.model.Sport
import org.json4s.native.Serialization.{write => swrite, _}

import org.json4s._
import com.currant.model.SportCreateRequest
import com.currant.ds.DataHttpService

// this trait defines our service behavior independently from the service actor
trait SportEndpoint extends DataHttpService {

  implicit val formats = native.Serialization.formats(NoTypeHints)

  val sportDataService = SportService(db)

  val sportRoute =
    pathPrefix("sports") {
      get {
        respondWithMediaType(`application/json`) {
          complete {
            swrite(sportDataService.getAll)
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
}