package com.cn.app

object Main {
  def main(args: Array[String]): Unit = {
    val card = Card(CardType.Jack);
    println("card :" + card.toString)
    println("card value:" + card.getValue)
    println("CardType.values.size:" + CardType.values.size)

    val deck = Deck(3432)
    println("deck size :" + deck.size())
    println("deck toString :" + deck.toString())

    // Deal first card
    var removeCard = deck.dealCard();
    println("card.cardType :" + removeCard.cardType)
    println("deck.size :" + deck.size())
    println("deck.toString :" + deck.toString())

    // Deal second card
    removeCard = deck.dealCard()
    println("card.cardType :" + removeCard.cardType)
    println("deck.size :" + deck.size())
    println("deck.toString :" + deck.toString())

    do {
      removeCard = deck.dealCard()
      println("card.cardType :" + removeCard.cardType)
      println("deck.size :" + deck.size())
      println("deck.toString :" + deck.toString())
    } while ( 1 <= 9)

    // deal second last card in deck
    removeCard = deck.dealCard()
    println("card.cardType :" + removeCard.cardType)
    println("deck.size :" + deck.size())
    println("deck.toString :" + deck.toString())

    deck.shuffle()
//    val expected = "Nine, Two, Seven, Five, Queen, King, Four, Eight, Six, Three, Ten, Ace, Jack"
//    assert(deck.size === CardType.values.size)
//    assert(deck.toString === expected)
    println("card.cardType :" + removeCard.cardType)
    println("deck.size :" + deck.size())
    println("deck.toString :" + deck.toString())
  }
}