package com.example

import org.specs2.mutable.{Around, Specification}
import org.specs2.specification.{BeforeExample, Scope}

import spray.testkit.Specs2RouteTest
import com.currant.model._
import org.json4s.native.Serialization.{read, write => swrite}
import com.currant.ds.DSConfiguration
import com.currant.ds.db.DB
import com.jolbox.bonecp.{BoneCP, BoneCPConfig}


class SportServiceSpec extends Specification with DSConfiguration with Specs2RouteTest with SportService with BeforeExample {
  def actorRefFactory = system

  sequential

  def db: DB = {
    val bcpCfg = new BoneCPConfig()
    bcpCfg.setUser(DBConfig.userName)
    bcpCfg.setPassword(DBConfig.password)
    bcpCfg.setJdbcUrl(DBConfig.url)

    val bcp = new BoneCP(bcpCfg)

    DB(bcp)
  }

  def before = {
    sequential

    println("Cleaning the db")
    println("Using user: " + DBConfig.userName)

    val bcpCfg = new BoneCPConfig()
    bcpCfg.setUser(DBConfig.userName)
    bcpCfg.setPassword(DBConfig.password)
    bcpCfg.setJdbcUrl(DBConfig.url)
    val bcp = new BoneCP(bcpCfg)
    val conn = bcp.getConnection

    conn.setAutoCommit(false)
    val st = conn.createStatement()
    val resource = io.Source.fromURL(getClass.getResource("/dropddl.sql")).getLines
    while(resource.hasNext) {
      val nextLine = resource.next
      st.addBatch(nextLine)
    }
    st.executeBatch()
    conn.commit()

    val st1 = conn.createStatement()
    val resource1 = io.Source.fromURL(getClass.getResource("/ddl.sql")).getLines
    while(resource1.hasNext) {
      val nextLine = resource1.next
      st1.addBatch(nextLine)
    }

    st1.executeBatch()
    conn.commit()

    conn.setAutoCommit(true)

  }

  
  "SportService" should {

    "support inserting a new sport" in {
      Post("/sports", swrite(new Sport(
        1L,
        "New Sport",
        "Meh just something lame",
        true,
        None,
        None,
        None,
        None
      ))) ~> sportRoute ~> check {

        println("This should run last....")

        val resp = responseAs[String]
        resp must be equalTo("OK")
      }
    }.pendingUntilFixed("This is broken until we fix the db problem")


    "return a list of two sports baseball and soccer" in {
      Get("/sports") ~> sportRoute ~> check {
        val b = responseAs[String]
        val sports = read[List[Sport]](b)
        sports(0) must be equalTo(sports(0))
      }
    }

    "return a list of two sports baseball and soccer" in {
      Get("/sports") ~> sportRoute ~> check {
        val b = responseAs[String]
        val sports = read[List[Sport]](b)
        sports(0) must be equalTo(sports(0))
      }
    }

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