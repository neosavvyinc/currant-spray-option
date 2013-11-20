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

    val bcpCfg = new BoneCPConfig()
    bcpCfg.setUser(DBConfig.userName)
    bcpCfg.setPassword(DBConfig.password)
    bcpCfg.setJdbcUrl(DBConfig.url)
    val bcp = new BoneCP(bcpCfg)

    def executeDDL(ddl: String) {
      val conn = bcp.getConnection

      conn.setAutoCommit(false)
      val st = conn.createStatement()
      val resource = io.Source.fromURL(getClass.getResource(ddl)).getLines
      while (resource.hasNext) {
        val nextLine = resource.next
        st.addBatch(nextLine)
      }
      st.executeBatch()
      conn.commit()
      conn.setAutoCommit(true)
    }

    executeDDL("/dropddl.sql")
    executeDDL("/ddl.sql")
  }

}
