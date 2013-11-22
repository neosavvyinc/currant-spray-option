package com.currant.ds.user

import com.currant.ds.DBAwareBaseServiceSpec


class UserEndpointSpec extends DBAwareBaseServiceSpec with UserEndpoint{

  override def dbScripts: Set[String] = Set("/sql/sport/register.sql")

}