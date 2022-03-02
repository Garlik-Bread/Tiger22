// package sampleCode.ElevensLab.Activity1;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card myCard = new Card("King", "Diamonds", 13);
		Card myCard2 = new Card("King", "Diamonds", 13);
		Card myCard3 = new Card("Seven", "Clubs", 7);

		System.out.println(myCard);
		System.out.println(myCard2);
		System.out.println(myCard3);

		if (myCard.getSuit().equals (myCard2.getSuit())) {
			System.out.println(myCard + " and " + myCard2 + " have the same suit.");
			if (myCard.getRank().equals (myCard2.getRank())) {
				System.out.println(myCard + " and " + myCard2 + " have the same rank.");
				if (myCard.getPointValue() == (myCard2.getPointValue())){
				System.out.println(myCard + " and " + myCard2 + " are the same card.");
				}
			}
		}
		if (myCard.matches(myCard2)){
			System.out.println("Card 1 and 2 are the same.");
		} else if (myCard.matches(myCard3)){
			System.out.println("Card 1 and 3 are the same.");
		} else if (myCard2.matches(myCard3)){
			System.out.println("Card 2 and 3 are the same.");
		}


	}
}
