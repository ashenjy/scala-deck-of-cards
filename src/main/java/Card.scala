///**
// * An object of type Card represents a playing card from a
// * standard Poker deck, including Jokers.  The card has a suit, which
// * can be spades, hearts, diamonds, clubs, or joker.  A spade, heart,
// * diamond, or club has one of the 13 values: ace, 2, 3, 4, 5, 6, 7,
// * 8, 9, 10, jack, queen, or king.  Note that "ace" is considered to be
// * the smallest value.  A joker can also have an associated value;
// * this value can be anything and can be used to keep track of several
// * different jokers.
// */
//object Card {
//  val SPADES = 0 // Codes for the 4 suits, plus Joker.
//  val HEARTS = 1
//  val DIAMONDS = 2
//  val CLUBS = 3
//  val JOKER = 4
//  val ACE = 1 // Codes for the non-numeric cards.
//  val JACK = 11 //   Cards 2 through 10 have their
//  val QUEEN = 12 //   numerical values for their codes.
//  val KING = 13
//}
//
//class Card()
//
///**
// * Creates a Joker, with 1 as the associated value.  (Note that
// * "new Card()" is equivalent to "new Card(1,Card.JOKER)".)
// */ {
//  suit = Card.JOKER
//  value = 1
//  /**
//   * This card's suit, one of the constants SPADES, HEARTS, DIAMONDS,
//   * CLUBS, or JOKER.  The suit cannot be changed after the card is
//   * constructed.
//   */
//  final private var suit = 0
//  /**
//   * The card's value.  For a normal card, this is one of the values
//   * 1 through 13, with 1 representing ACE.  For a JOKER, the value
//   * can be anything.  The value cannot be changed after the card
//   * is constructed.
//   */
//  final private var value = 0
//
//  /**
//   * Creates a card with a specified suit and value.
//   *
//   * @param theValue the value of the new card.  For a regular card (non-joker),
//   *                 the value must be in the range 1 through 13, with 1 representing an Ace.
//   *                 You can use the constants Card.ACE, Card.JACK, Card.QUEEN, and Card.KING.
//   *                 For a Joker, the value can be anything.
//   * @param theSuit  the suit of the new card.  This must be one of the values
//   *                 Card.SPADES, Card.HEARTS, Card.DIAMONDS, Card.CLUBS, or Card.JOKER.
//   * @throws IllegalArgumentException if the parameter values are not in the
//   *                                  permissible ranges
//   */
//  def this(theValue: Int, theSuit: Int)
//
//  /**
//   * Returns the suit of this card.
//   *
//   * @returns the suit, which is one of the constants Card.SPADES,
//   *          Card.HEARTS, Card.DIAMONDS, Card.CLUBS, or Card.JOKER
//   */
//  def getSuit = suit
//
//  /**
//   * Returns the value of this card.
//   *
//   * @return the value, which is one of the numbers 1 through 13, inclusive for
//   *         a regular card, and which can be any value for a Joker.
//   */
//  def getValue = value
//
//  /**
//   * Returns a String representation of the card's suit.
//   *
//   * @return one of the strings "Spades", "Hearts", "Diamonds", "Clubs"
//   *         or "Joker".
//   */
//  def getSuitAsString = suit match {
//    case Card.SPADES =>
//      "Spades"
//    case Card.HEARTS =>
//      "Hearts"
//    case Card.DIAMONDS =>
//      "Diamonds"
//    case Card.CLUBS =>
//      "Clubs"
//    case _ =>
//      "Joker"
//  }
//
//  /**
//   * Returns a String representation of the card's value.
//   *
//   * @return for a regular card, one of the strings "Ace", "2",
//   *         "3", ..., "10", "Jack", "Queen", or "King".  For a Joker, the
//   *         string is always numerical.
//   */
//  def getValueAsString = if (suit == Card.JOKER) "" + value
//  else value match {
//    case 1 =>
//      "Ace"
//    case 2 =>
//      "2"
//    case 3 =>
//      "3"
//    case 4 =>
//      "4"
//    case 5 =>
//      "5"
//    case 6 =>
//      "6"
//    case 7 =>
//      "7"
//    case 8 =>
//      "8"
//    case 9 =>
//      "9"
//    case 10 =>
//      "10"
//    case 11 =>
//      "Jack"
//    case 12 =>
//      "Queen"
//    case _ =>
//      "King"
//  }
//
//  /**
//   * Returns a string representation of this card, including both
//   * its suit and its value (except that for a Joker with value 1,
//   * the return value is just "Joker").  Sample return values
//   * are: "Queen of Hearts", "10 of Diamonds", "Ace of Spades",
//   * "Joker", "Joker #2"
//   */
//  override def toString = if (suit == Card.JOKER) if (value == 1) "Joker"
//  else "Joker #" + value
//  else getValueAsString + " of " + getSuitAsString
//  // end class Card
//}