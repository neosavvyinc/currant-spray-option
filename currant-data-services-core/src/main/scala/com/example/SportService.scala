package com.example

import spray.http._
import MediaTypes._
import com.currant.model.{SportCreateRequest, Sport}
import org.json4s.native.Serialization.{read, write => swrite}

import org.json4s._
import com.currant.ds.services.SportDataService

// this trait defines our service behavior independently from the service actor
trait SportService extends DataHttpService {

  implicit val formats = native.Serialization.formats(NoTypeHints)

  val sportDataService = SportDataService(db)

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
}