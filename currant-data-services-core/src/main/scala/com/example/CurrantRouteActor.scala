package com.example

import akka.actor.Actor
import org.json4s.{NoTypeHints, native}

/**
 * Created by Neosavvy
 *
 * User: adamparrish
 * Date: 11/16/13
 * Time: 4:53 PM
 */
class CurrantRouteActor extends Actor with GameService with SportService {
  // the HttpService trait defines only one abstract member, which
  // connects the services environment to the enclosing actor or test
  def actorRefFactory = context

  // this actor only runs our route, but you could add
  // other things here, like request stream processing
  // or timeout handling
  def receive = runRoute(
    sportRoute ~
    gameRoute
  )

  override implicit val formats = native.Serialization.formats(NoTypeHints)
}
