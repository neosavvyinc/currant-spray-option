package com.currant.ds.profile

import com.currant.ds.DBAwareBaseServiceSpec
import com.currant.model.{CurrantUserJsonImplicits, Profile}
import spray.json._
import spray.httpx.SprayJsonSupport._
import spray.http.StatusCodes._
import CurrantUserJsonImplicits._

/**
 * Created by Neosavvy - test1
 *
 * User: adamparrish
 * Date: 11/21/13
 * Time: 9:35 PM
 */
object ProfileServiceSpec extends DBAwareBaseServiceSpec with ProfileEndpoint {

  sequential

  "ProfileService" should {
    "support finding a profile by an integer id" in {

      Get("/profile/1") ~> profileRoute ~> check {
        status == OK
        val profile = responseAs[Profile]
        profile.id must be equalTo 1
      }
    }
  }


}
