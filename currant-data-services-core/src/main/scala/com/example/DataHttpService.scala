package com.example

import spray.routing.HttpService
import com.currant.ds.db.DB


trait DataHttpService extends HttpService{

  def db : DB

}