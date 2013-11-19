package com.currant.ds.services

import com.currant.ds.db.DB
import com.currant.model.{Sport, SportCreateRequest}
import com.currant.ds.db.crud.SportCRUD


trait SportsDataService {

  def create(cr: SportCreateRequest): Sport

  def getAll: Seq[Sport]

  def get(id : Long) : Option[Sport]

  def delete(ids: List[Long]): Unit

  def update(sport: Sport): Sport
}

object SportDataService {

  def apply(db: DB) = new SportsDataService {
    def create(cr: SportCreateRequest): Sport = {
      val partiallyApplied = SportCRUD.create(cr) _
      val id = db.withTransactionContext(partiallyApplied)
      Sport.from(id, cr)
    }

    def getAll: Seq[Sport] = {
      db.withContext(SportCRUD.list)
    }


    def get(id: Long): Option[Sport] = {
     db.withContext(SportCRUD.byId(id))
    }

    def delete(ids: List[Long]): Unit = {
      val partiallyApplied = SportCRUD.delete(ids) _
      db.withTransactionContext(partiallyApplied)
    }

    def update(sport: Sport): Sport = {
      val partiallyApplied = SportCRUD.update(sport) _
      db.withTransactionContext(partiallyApplied)
      sport
    }
  }

}




