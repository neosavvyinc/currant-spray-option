package com.currant.ds.profile

import spray.http._
import MediaTypes._

import com.example.DataHttpService
import org.json4s.{ShortTypeHints}
import org.json4s.native.Serialization.{write => swrite, _}
import org.json4s.native.Serialization
import com.currant.model._
import com.currant.model.EarlyMorning
import com.currant.model.Night
import com.currant.model.Currant
import com.currant.model.Facebook
import org.json4s.ShortTypeHints


/**
 * Created by Neosavvy
 *
 * User: adamparrish
 * Date: 11/21/13
 * Time: 9:36 PM
 */
trait ProfileEndpoint extends DataHttpService {


  implicit val formats = Serialization.formats(
    ShortTypeHints(
      List(
        classOf[Facebook],
        classOf[Currant],
        classOf[EarlyMorning],
        classOf[Morning],
        classOf[Day],
        classOf[Evening],
        classOf[Night],
        classOf[Standard],
        classOf[Elite]
      )
    )
  )

  val profileDataService = ProfileService(db)

//  ~
//
//    /**
//     *
//     */
//    path("extended" / IntNumber) { id =>
//      get {
//        respondWithMediaType(`application/json`) {
//          complete {
//            val profileObject = profileDataService.findExtendedProfile( id )
//            swrite(profileObject)
//          }
//        }
//
//      }
//    }

  val profileRoute =
    pathPrefix("profile") {

      /**
       *
       */
      path(IntNumber) { id =>
        get {
          respondWithMediaType(`application/json`) {
            complete {
              val profileObject = profileDataService.findProfile( id )
              swrite(profileObject)
            }
          }
        }
      }

    }

}
