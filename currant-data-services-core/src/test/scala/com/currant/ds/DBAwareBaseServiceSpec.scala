package com.currant.ds

import org.specs2.mutable.Specification
import org.specs2.specification.BeforeExample


import spray.testkit.Specs2RouteTest
import com.currant.ds.db.DB
import com.jolbox.bonecp.{BoneCP, BoneCPConfig}
import java.sql.ResultSet


/**
 * Created by Neosavvy
 *
 * User: adamparrish
 * Date: 11/20/13
 * Time: 8:17 AM
 */
trait DBAwareBaseServiceSpec extends Specification with DSConfiguration with Specs2RouteTest with BeforeExample {

  def actorRefFactory = system

  def dbScripts: Set[String] = Set.empty

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
    val bcp = setupNewConnectionPool()
    println("resetting the db...")
    executeBatch("/drop-ddl.sql", bcp)
    executeBatch("/ddl.sql", bcp)
    executeScripts(bcp)
    bcp.close()
    bcp.shutdown()
  }


  def setupNewConnectionPool(): BoneCP = {
    val bcpCfg = new BoneCPConfig()
    bcpCfg.setUser(DBConfig.userName)
    bcpCfg.setPassword(DBConfig.password)
    bcpCfg.setJdbcUrl(DBConfig.url)
    new BoneCP(bcpCfg)
  }

  def executeBatch(ddl: String, bcp: BoneCP) {
    println(s"executing $ddl")
    val conn = bcp.getConnection
    conn.setAutoCommit(false)
    val queries = QueryReader.fromFile(ddl)
    queries.foreach {
      q =>
        try {
          val st = conn.createStatement()
          st.execute(q)
        } catch {
          case e: Exception => println("Caught an error: " + e.toString)
        }
    }

    conn.commit()
    conn.setAutoCommit(true)

  }

  def executeScripts(bcp: BoneCP) {
    dbScripts.foreach(executeBatch(_, bcp))
  }

  def executeCountForTable(table: String, bcp: BoneCP = setupNewConnectionPool): Integer = {
    val sql = "SELECT COUNT(*) AS COUNT FROM " + table
    val conn = bcp.getConnection
    val rs: ResultSet = conn.createStatement.executeQuery(sql)
    rs.next()
    rs.getInt("count")
  }

}
