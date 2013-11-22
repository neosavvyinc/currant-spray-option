package com.currant.ds.game

import com.currant.ds.db.DB
import com.currant.model.{Game, GameCreateRequest}
import com.currant.ds.db.crud.SportCRUD

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/21/13
 * Time: 8:28 PM
 * To change this template use File | Settings | File Templates.
 */
trait GameService {
  def getAll: Seq[Game]
}

object GameService {
  def apply(db: DB) = new GameService {

    def getAll: Seq[Game] = {
      Seq(
        Game(1, "calvinball", "no rules", true, None, None, None, None)
      )
    }
  }
}

