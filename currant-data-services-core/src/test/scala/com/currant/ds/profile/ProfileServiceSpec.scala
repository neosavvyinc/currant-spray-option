package com.currant.ds.profile

import org.json4s.native.Serialization.{read, write => swrite}
import com.currant.ds.DBAwareBaseServiceSpec
import com.currant.model.Profile
import org.specs2.runner.JUnitRunner
import org.junit.runner.RunWith

/**
 * Created by Neosavvy - test
 *
 * User: adamparrish
 * Date: 11/21/13
 * Time: 9:35 PM
 */
@RunWith(classOf[JUnitRunner])
object ProfileServiceSpec extends DBAwareBaseServiceSpec with ProfileEndpoint {

  "ProfileService" should {
    "support finding a profile by an integer id" in {
      Get("/profile/1") ~> profileRoute ~> check {
        val profile = responseAs[String]
        val profileObj = read[Profile](profile)
        profileObj.id must be equalTo(1)
      }
    }
  }


}
