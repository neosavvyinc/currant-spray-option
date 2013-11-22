package com.currant.ds.game

import org.specs2.mutable.{Around, Specification}
import org.specs2.specification.{BeforeExample, Scope}

import spray.testkit.Specs2RouteTest
import com.currant.model._
import org.json4s.native.Serialization.{read, write => swrite}
import com.currant.ds.{DBAwareBaseServiceSpec, DSConfiguration}
import com.currant.ds.db.DB
import com.jolbox.bonecp.{BoneCP, BoneCPConfig}

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/21/13
 * Time: 8:49 PM
 */

class GameEndpointSpec extends DBAwareBaseServiceSpec with GameEndpoint {

  "GameService" should {
    "support return a list of games" in {
      val testGame:Game = Game(1, "calvinball", "no rules", true, None, None, None, None)
      Get("/games") ~> gameRoute ~> check {
        val gamesString = responseAs[String]
        val games = read[List[Game]](gamesString)
        games(0) must be equalTo(testGame)
      }
    }
  }
}
