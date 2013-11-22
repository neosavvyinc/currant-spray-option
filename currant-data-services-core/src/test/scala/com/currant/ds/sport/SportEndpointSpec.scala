package com.currant.ds.sport

import com.currant.model._
import org.json4s.native.Serialization.{read, write => swrite}
import com.currant.ds.DBAwareBaseServiceSpec

class SportEndpointSpec extends DBAwareBaseServiceSpec with SportEndpoint {

  "SportService" should {
    "support inserting a new sport" in {
      val testSport = sportCreateReq("Baseball", "With a bat")
      Put("/sports", swrite(testSport)) ~> sportRoute ~> check {
        val resp = responseAs[String]
        val sport = read[Sport](resp)
        sport.name must be equalTo testSport.name
      }
    }

    "return a list of two sports baseball and soccer" in {

      val testSport = sportCreateReq("Soccer", "With a ball")
      val testSport1 = sportCreateReq("Badminton", "Racquets")

      Put("/sports", swrite(testSport)) ~> sportRoute ~> check {}
      Put("/sports", swrite(testSport1)) ~> sportRoute ~> check {}

      Get("/sports") ~> sportRoute ~> check {
        val b = responseAs[String]
        val sports = read[List[Sport]](b)
        sports must have size 2

      }
    }

    /* "allow a new sport parameter to be posted in" in {
       val testSport = sportCreateReq("Target Practice", "With them thar guns")
       Put("/sports", swrite(testSport)) ~> sportRoute ~> check {}
 
       val testSportUpdate = Sport(1, "new name", "new descript", true, None, None, None, None)
 
       Post("/sports", swrite(testSportUpdate)) ~> sportRoute ~> check {}
 
       Get("/sports/1") ~> sportRoute ~> check {
         val resp = responseAs[String]
         val sport = read[Sport](resp)
         sport must be equalTo testSportUpdate
       }
 
     }*/

    "allow a get with id to return one sport that matches the id" in {
      val testSport = sportCreateReq("Target Practice", "With them thar guns")
      Put ("/sports", swrite(testSport)) ~> sportRoute ~> check {}

      Get("/sports/1") ~> sportRoute ~> check {
        val resp = responseAs[String]
        val sport = read[Sport](resp)
        sport.name must be equalTo testSport.name
      }
    }

    "support a delete which should simply return ok" in {
      Delete("/sports/1") ~> sportRoute ~> check {
        val resp = responseAs[String]
        resp must be equalTo ("OK")
      }
    }
  }

  private def sportCreateReq(name: String, descrip: String) = SportCreateRequest(name, descrip, true, None, None, None, None)

}