package com.currant.ds.db.crud

import com.currant.model.{Game, GameCreateRequest}
import org.jooq.{Record, DSLContext}
import com.currant.jooq.tables.Game.GAME
import scala.collection.JavaConversions._

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/21/13
 * Time: 9:50 PM
 */

class GameCRUD {

  def list(ctx: DSLContext): Seq[Game] = {
    val allGames = ctx.selectFrom(GAME).fetch()
    iterableAsScalaIterable(allGames).map(fromRecord(game => game)).toSeq
  }

  def fromRecord(r: Record): Game = {
    Game(
      r.getValue(GAME.GAME_ID),
      "NAME", //r.getValue(GAME.),
      r.getValue(GAME.DESCRIPTION),
      r.getValue(GAME.ACTIVE),
      Some("IMAGEURL"),
      Some(1), //"MIN PLAYERS",
      Some(5), //"MAX PLAYERS"
      Some(1) // wait list
    )
  }
}
