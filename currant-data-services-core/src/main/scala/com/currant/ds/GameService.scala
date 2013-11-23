package com.currant.ds

import spray.routing._
import spray.http._
import MediaTypes._
import com.currant.model.Game
import org.json4s.native.Serialization.{read, write => swrite}

import org.json4s._

// this trait defines our service behavior independently from the service actor
trait GameService extends HttpService {

}