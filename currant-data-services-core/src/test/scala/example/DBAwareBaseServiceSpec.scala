package example

import org.specs2.mutable.Specification
import com.currant.ds.db.DB
import com.jolbox.bonecp.{BoneCP, BoneCPConfig}
import org.specs2.specification.BeforeExample
import spray.testkit.Specs2RouteTest
import com.currant.ds.DSConfiguration


import spray.testkit.Specs2RouteTest
import com.currant.ds.DSConfiguration
import com.currant.ds.db.DB
import com.jolbox.bonecp.{BoneCP, BoneCPConfig}
import java.sql.{Statement, ResultSet}


/**
 * Created by Neosavvy
 *
 * User: adamparrish
 * Date: 11/20/13
 * Time: 8:17 AM
 */
class DBAwareBaseServiceSpec extends Specification with DSConfiguration with Specs2RouteTest with BeforeExample
{

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
    println("Cleaning the db...")
    executeBatch("/dropddl.sql")
    executeBatch("/ddl.sql")
  }


  def setupNewConnectionPool() : BoneCP = {
    val bcpCfg = new BoneCPConfig()
    bcpCfg.setUser(DBConfig.userName)
    bcpCfg.setPassword(DBConfig.password)
    bcpCfg.setJdbcUrl(DBConfig.url)
    new BoneCP(bcpCfg)
  }

  def executeBatch(ddl: String, bcp: BoneCP = setupNewConnectionPool) {
      val conn = bcp.getConnection

      conn.setAutoCommit(false)

      val resource = io.Source.fromURL(getClass.getResource(ddl)).getLines
      while (resource.hasNext) {
        val nextLine = resource.next()
        try {
          val st = conn.createStatement()
          st.execute(nextLine)
        } catch {
          case e:Exception => println("Caught an error: " + e.toString)
        }
      }

      conn.commit()
      conn.setAutoCommit(true)

  }

  def executeCountForTable(table:String, bcp: BoneCP = setupNewConnectionPool) : Integer = {
    val sql = "SELECT COUNT(*) AS COUNT FROM " + table
    val conn = bcp.getConnection
    val rs : ResultSet = conn.createStatement.executeQuery(sql)
    rs.next()
    rs.getInt("count")
  }

}
