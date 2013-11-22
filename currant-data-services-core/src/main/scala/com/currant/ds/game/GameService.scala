package com.currant.ds.game

import com.currant.ds.db.DB
import scala.concurrent.{Future, future}
import com.currant.model.{Game, GameCreateRequest }
import com.currant.model.GameTypes._
//import com.currant.ds.db.crud.GameCRUD

// for now
import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/21/13
 * Time: 8:28 PM
 */

trait GameService {
  def getAll: Future[GamesList]

  def get(id: Long): Future[Option[Game]]

  def create(cr: GameCreateRequest): Future[Game]

  def update(cr: GameCreateRequest): Future[Game]

  def delete(ids: List[Long]): Future[Unit]
}

object GameService {
  def apply(db: DB) = new GameService {

    def getAll: Future[GamesList] = {
      future {
        Seq(
          Game(1, "calvinball", "no rules", true, None, None, None, None)
        )
      }
    }

    def get(id: Long): Future[Option[Game]] = {
      future {
        Some(
          Game(1, "calvinball", "no rules", true, None, None, None, None)
        )
      }
    }

    def create(cr: GameCreateRequest): Future[Game] = {
      future {
        Game(1, "calvinball", "no rules", true, None, None, None, None)
      }
    }

    def update(cr: GameCreateRequest): Future[Game] = {
      future {
        Game(1, "calvinball", "no rules", true, None, None, None, None)
      }
    }

    def delete(ids: List[Long]): Future[Unit] = {
      future {
        Unit
      }
    }
  }
}

