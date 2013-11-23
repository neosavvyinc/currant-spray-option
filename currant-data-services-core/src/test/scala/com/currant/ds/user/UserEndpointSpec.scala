package com.currant.ds.user

import com.currant.ds.DBAwareBaseServiceSpec
import com.currant.model.CurrantUserRegistration
import spray.json._
import spray.httpx.SprayJsonSupport._
import spray.http.StatusCodes._

class UserEndpointSpec extends DBAwareBaseServiceSpec with UserEndpoint{

  import UserEndPointProtocol._

  override def dbScripts: Set[String] = Set("/sql/sport/register.sql")

  "User Service" should {
    "be able to register a user without facebook" in {
      val newUser = CurrantUserRegistration("guy", "awesome", "maxpayne", "guy@johnson.com", "now", Seq(1), None)
      Post("/registration", newUser) ~> userRoute ~> check {
        status == OK
        //e//ntity
      }

    }
  }

}