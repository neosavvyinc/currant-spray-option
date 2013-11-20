package com.example

import org.specs2.mutable.Specification
import spray.testkit.Specs2RouteTest
import com.currant.model._
import org.json4s.native.Serialization.{read, write => swrite}
import com.currant.ds.DSConfiguration
import com.currant.ds.db.DB
import com.jolbox.bonecp.{BoneCP, BoneCPConfig}

class SportServiceSpec extends Specification with DSConfiguration with Specs2RouteTest with SportService {
  def actorRefFactory = system




  
  "SportService" should {

    "return a list of two sports baseball and soccer" in {
      Get("/sports") ~> sportRoute ~> check {
        val b = responseAs[String]
        val sports = read[List[Sport]](b)
        sports(0) must be equalTo(sports(0))
      }
    }

  }

  def db: DB = {
    val bcpCfg = new BoneCPConfig()
      bcpCfg.setUser(DBConfig.userName)
      bcpCfg.setPassword(DBConfig.password)
      bcpCfg.setJdbcUrl(DBConfig.url)

      val bcp = new BoneCP(bcpCfg)

      DB(bcp)
  }
}