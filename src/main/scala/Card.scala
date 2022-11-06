package com.cn.app

class Card() {

  var cardType: CardType.Value = _
  var cardValue: Int = _

  require(cardValue >= 0 && cardValue <= 12, s"Invalid card number: $cardType")

  override def toString: String= cardType.toString

  def getValue: Int = cardValue

//    CardType match {
//    case CardType.Ace =>
//      CardType.Ace.id
//    case CardType.Two =>
//      CardType.Two.id
//    case CardType.Three =>
//      CardType.Three.id
//    case CardType.Four =>
//      CardType.Four.id
//    case CardType.Five =>
//      CardType.Five.id
//    case CardType.Six =>
//      CardType.Six.id
//    case CardType.Seven =>
//      CardType.Seven.id
//    case CardType.Eight =>
//      CardType.Eight.id
//    case CardType.Nine =>
//      CardType.Nine.id
//    case CardType.Ten =>
//      CardType.Ten.id
//    case CardType.Jack =>
//      CardType.Jack.id
//    case CardType.Queen =>
//      CardType.Queen.id
//    case CardType.King =>
//      CardType.King.id
//  }

}

object Card {
  def apply(cardType: CardType.Value): Card = {
    var c = new Card
    c.cardType = cardType
    c.cardValue = cardType.id
    c
  }
}
