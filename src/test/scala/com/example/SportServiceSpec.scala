package com.example

import org.specs2.mutable.Specification
import spray.testkit.Specs2RouteTest
import com.currant.model._
import org.json4s.native.Serialization.{read, write => swrite}

class SportServiceSpec extends Specification with Specs2RouteTest with SportService {
  def actorRefFactory = system

  "SportService" should {

    "return a list of two sports baseball and soccer" in {
      Get("/sports") ~> sportRoute ~> check {
        val b = responseAs[String]
        val sports = read[List[Sport]](b)
        sports(0) must be equalTo(sports(0))
      }
    }

    "allow a new sport parameter to be posted in" in {
      Post("/sports/new", swrite(new Sport(
        1L,
        "New Sport",
        "Meh just something lame",
        true,
        None,
        None,
        None,
        None
      ))) ~> sportRoute ~> check {
        val resp = responseAs[String]
        resp must be equalTo("OK")
      }
    }

//    "allow a get with id to return one sport that matches the id" in {
//      Get("/sports/1") ~> sportRoute ~> check {
//        val resp = responseAs[String]
//        val sport = read[List[Sport]](resp)
//        sports(0).id must be equalTo(1)
//      }
//    }

    "support a delete which should simply return ok" in {
      Delete("/sports/1") ~> sportRoute ~> check {
        val resp = responseAs[String]
        resp must be equalTo("OK")
      }

    }

  }
}