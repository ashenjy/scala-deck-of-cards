///**
// * An object of type Deck represents a deck of playing cards.  The deck
// * is a regular poker deck that contains 52 regular cards and that can
// * also optionally include two Jokers.
// */
//class Deck(val includeJokers: Boolean)
//
///**
// * Constructs a poker deck of playing cards, The deck contains
// * the usual 52 cards and can optionally contain two Jokers
// * in addition, for a total of 54 cards.   Initially the cards
// * are in a sorted order.  The shuffle() method can be called to
// * randomize the order.
// *
// * @param includeJokers if true, two Jokers are included in the deck; if false,
// *                      there are no Jokers in the deck.
// */ {
//  if (includeJokers) deck = new Array[Card](54)
//  else deck = new Array[Card](52)
//  var cardCt = 0 // How many cards have been created so far.
//  for (suit <- 0 to 3) {
//    for (value <- 1 to 13) {
//      deck(cardCt) = new Card(value, suit)
//      cardCt += 1
//    }
//  }
//  if (includeJokers) {
//    deck(52) = new Card(1, Card.JOKER)
//    deck(53) = new Card(2, Card.JOKER)
//  }
//  cardsUsed = 0
//  /**
//   * An array of 52 or 54 cards.  A 54-card deck contains two Jokers,
//   * in addition to the 52 cards of a regular poker deck.
//   */
//  private var deck = null
//  /**
//   * Keeps track of the number of cards that have been dealt from
//   * the deck so far.
//   */
//  private var cardsUsed = 0
//
//  /**
//   * Constructs a regular 52-card poker deck.  Initially, the cards
//   * are in a sorted order.  The shuffle() method can be called to
//   * randomize the order.  (Note that "new Deck()" is equivalent
//   * to "new Deck(false)".)
//   */
//  def this {
//    this(false) // Just call the other constructor in this class.
//  }
//
//  /**
//   * Put all the used cards back into the deck (if any), and
//   * shuffle the deck into a random order.
//   */
//  def shuffle() = {
//    for (i <- deck.length - 1 until 0 by -1) {
//      val rand = (Math.random * (i + 1)).toInt
//      val temp = deck(i)
//      deck(i) = deck(rand)
//      deck(rand) = temp
//    }
//    cardsUsed = 0
//  }
//
//  /**
//   * As cards are dealt from the deck, the number of cards left
//   * decreases.  This function returns the number of cards that
//   * are still left in the deck.  The return value would be
//   * 52 or 54 (depending on whether the deck includes Jokers)
//   * when the deck is first created or after the deck has been
//   * shuffled.  It decreases by 1 each time the dealCard() method
//   * is called.
//   */
//  def cardsLeft = deck.length - cardsUsed
//
//  /**
//   * Removes the next card from the deck and return it.  It is illegal
//   * to call this method if there are no more cards in the deck.  You can
//   * check the number of cards remaining by calling the cardsLeft() function.
//   *
//   * @return the card which is removed from the deck.
//   * @throws IllegalStateException if there are no cards left in the deck
//   */
//  def dealCard = {
//    if (cardsUsed == deck.length) throw new IllegalStateException("No cards are left in the deck.")
//    cardsUsed += 1
//    deck(cardsUsed - 1)
//    // Programming note:  Cards are not literally removed from the array
//    // that represents the deck.  We just keep track of how many cards
//    // have been used.
//  }
//
//  /**
//   * Test whether the deck contains Jokers.
//   *
//   * @return true, if this is a 54-card deck containing two jokers, or false if
//   *         this is a 52 card deck that contains no jokers.
//   */
//  def hasJokers = deck.length == 54
//  // end class Deck
//}