package com.example

import org.specs2.mutable.{Around, Specification}
import org.specs2.specification.{BeforeExample, Scope}

import spray.testkit.Specs2RouteTest
import com.currant.model._
import org.json4s.native.Serialization.{read, write => swrite}
import com.currant.ds.DSConfiguration
import com.currant.ds.db.DB
import com.jolbox.bonecp.{BoneCP, BoneCPConfig}
import example.DBAwareBaseServiceSpec


class SportServiceSpec extends DBAwareBaseServiceSpec with SportService{

  "SportService" should {
    "support inserting a new sport" in {
      val testSport: Sport = new Sport(
        1L,
        "New Sport",
        "Meh just something lame",
        true,
        None,
        None,
        None,
        None
      )
      Post("/sports", swrite(testSport)) ~> sportRoute ~> check {
        val resp = responseAs[String]
        resp must be equalTo(swrite(testSport))
      }
      executeCountForTable("SPORT") must be equalTo(1)
    }

    "return a list of two sports baseball and soccer" in {
      Get("/sports") ~> sportRoute ~> check {
        val b = responseAs[String]
        val sports = read[List[Sport]](b)
        sports(0) must be equalTo(sports(0))
      }
    }.pendingUntilFixed("This is broken until we fix the db problem")

    "allow a new sport parameter to be posted in" in {
      Put("/sports", swrite(new Sport(
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
    }.pendingUntilFixed("This is broken until we fix the db problem")

    "allow a get with id to return one sport that matches the id" in {
      Get("/sports/1") ~> sportRoute ~> check {
        val resp = responseAs[String]
        val sport = read[List[Sport]](resp)
        sport(0).id must be equalTo(1)
      }
    }.pendingUntilFixed("This is broken until we fix the db problem")

    "support a delete which should simply return ok" in {
      Delete("/sports/1") ~> sportRoute ~> check {
        val resp = responseAs[String]
        resp must be equalTo("OK")
      }

    }

  }
}