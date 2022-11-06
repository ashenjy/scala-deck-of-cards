package com.cn.app

import scala.collection.mutable.ListBuffer

class Deck() {

  var seed: Int = _

  val deck: ListBuffer[Card] = for {
    cardType <- CardType.all
  } yield Card(cardType);

  private var cardsUsed = 0

  def dealCard(): Card = {
    if (deck.isEmpty) throw new IllegalStateException("No cards are left in the deck.")
    cardsUsed += 1
    println("dealCard().cardsUsed :" + cardsUsed)
    deck.remove(0)
    // Programming note:  Cards are not literally removed from the array
    // that represents the deck.  We just keep track of how many cards
    // have been used.
  }

  /**
   * Put all the used cards back into the deck (if any), and
   * shuffle the deck into a random order.
   */
  def shuffle(): Unit = {
    for (i <- deck.length - 1 until 0 by -1) {
      val rand = seed * (i+1)
      val temp = deck(i)
      deck(i) = deck(rand)
      deck(seed) = temp
    }
    cardsUsed = 0
  }


  def size(): Int = deck.length

  override def toString: String = deck.mkString(", ")
}

object Deck {
  def apply(seed: Int): Deck = {
    var d = new Deck
    d.seed = seed
    d.cardsUsed = 0
    d
  }

  def apply(): Deck = {
    var d = new Deck
    d.seed = 8475136
    d.cardsUsed = 0
    d
  }
}
