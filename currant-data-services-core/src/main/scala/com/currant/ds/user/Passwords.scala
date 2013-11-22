package com.currant.ds.user

import java.util.UUID


object Passwords {

  def generateNewSeed : String = UUID.randomUUID().toString

  //TODO: HASH
  def hashPassword(password : String, seed : String) : String = {
    password + seed
  }

}