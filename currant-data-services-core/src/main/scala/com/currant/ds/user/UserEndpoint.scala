package com.currant.ds.user

import com.example.DataHttpService
import spray.http.MediaTypes._
import com.currant.model.{InsertResponse, CurrantUserRegistration}
import spray.json._
import spray.httpx.SprayJsonSupport._

object UserEndPointProtocol extends DefaultJsonProtocol {
    implicit val colorFormat = jsonFormat7(CurrantUserRegistration)
    implicit val insertFormat = jsonFormat2(InsertResponse)
  }

trait UserEndpoint extends DataHttpService {

  import UserEndPointProtocol._


  val userService = UserService(db)

  val userRoute =
    pathPrefix("registration") {
      post {
        respondWithMediaType(`application/json`)
        entity(as[CurrantUserRegistration]) {
          reg =>
            complete {
              userService.registerUser(reg)
            }
        }
      }
    }


}