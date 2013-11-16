package com.example

import org.specs2.mutable.Specification
import spray.testkit.Specs2RouteTest
import spray.http._
import StatusCodes._

class SportServiceSpec extends Specification with Specs2RouteTest with SportService {
  def actorRefFactory = system
  
  "SportService" should {

    "return a list of two sports baseball and soccer" in {
      Get() ~> sportRoute ~> check {
        responseAs[JSON] must contain("Say hello")
      }
    }

  }
}
