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
import com.currant.ds.sport.SportEndpoint


class SportEndpointSpec extends DBAwareBaseServiceSpec with SportEndpoint {

  "SportService" should {
    "support inserting a new sport" in {
      val testSport:Sport = generateTestSport(1, "Baseball", "With a bat")
      Post("/sports", swrite(testSport)) ~> sportRoute ~> check {
        val resp = responseAs[String]
        resp must be equalTo(swrite(testSport))
      }
      executeCountForTable("SPORT") must be equalTo(1)
    }

    "return a list of two sports baseball and soccer" in {

      executeCountForTable("SPORT") must be equalTo(0)
      val testSport:Sport = generateTestSport(1, "Soccer", "With a ball")
      val testSport1:Sport = generateTestSport(2, "Badminton", "Racquets")

      Post("/sports", swrite(testSport)) ~> sportRoute ~> check {}
      Post("/sports", swrite(testSport1)) ~> sportRoute ~> check {}
      executeCountForTable("SPORT") must be equalTo(2)


      Get("/sports") ~> sportRoute ~> check {
        val b = responseAs[String]
        val sports = read[List[Sport]](b)
        sports(0) must be equalTo(testSport)
        sports(1) must be equalTo(testSport1)
      }
    }

    "allow a new sport parameter to be posted in" in {
      val testSport:Sport = generateTestSport(3, "Target Practice", "With them thar guns")
      Post("/sports", swrite(testSport)) ~> sportRoute ~> check {}
      executeCountForTable("SPORT") must be equalTo(1)

      val testSportUpdate:Sport = generateTestSport(3, "Archery", "With Bows and Arrows")

      Put("/sports", swrite(testSportUpdate)) ~> sportRoute ~> check {
        val resp = responseAs[String]
        resp must be equalTo(swrite(testSportUpdate))
      }
      executeCountForTable("SPORT") must be equalTo(1)
    }

    "allow a get with id to return one sport that matches the id" in {
      val testSport:Sport = generateTestSport(1, "Target Practice", "With them thar guns")
      Post("/sports", swrite(testSport)) ~> sportRoute ~> check {}
      executeCountForTable("SPORT") must be equalTo(1)

      Get("/sports/1") ~> sportRoute ~> check {
        val resp = responseAs[String]
        val sport = read[List[Sport]](resp)
        sport(0) must be equalTo(testSport)
      }
    }

    "support a delete which should simply return ok" in {
      Delete("/sports/1") ~> sportRoute ~> check {
        val resp = responseAs[String]
        resp must be equalTo("OK")
      }

    }

  }

  def generateTestSport( id : Long, sportName : String, sportDesc : String ): Sport =  {
    new Sport(
      id,
      sportName,
      sportDesc,
      true,
      None,
      None,
      None,
      None
    )
  }
}