package com.cn.app

import scala.collection.mutable.ListBuffer

object CardType extends Enumeration {

  type Card = Value

  val Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King = Value

  val all = ListBuffer(Ten, Eight, Queen, Four, Nine, King, Two, Ace, Five, Jack, Seven, Six, Three)

}
