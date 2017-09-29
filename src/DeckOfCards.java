

import java.util.Random;
import java.util.ArrayList;

public class DeckOfCards {
	private ArrayList<cards> cards;

	public DeckOfCards()

	{
		/**
		 * These are variables that will be used later on.
		 */
		Random num = new Random();
		cards = new ArrayList<cards>();
		int value1;
		int value2;
		cards cardVariable;
		
		/**This for loop runs the 4 suits and has another for loop 
		 * that puts the 12 different ranks into each suit and then 
		 * takes those values and puts them into the card class to create
		 * a new cards object
		 */
		for (int suit = 0; suit < 4; suit++) {
			for (int rank = 0; rank < 13; rank++) {
				String color = null;
				cards.add(new cards(suit, rank, color));
			}
		}
		/**Runs a for loop 52 times to create a new card and decreases the deck size by 1
		 * that same card from the deck so that we don't repeat any of the same cards
		 */
		for (int i = 0; i < 52; i++) {
			value1 = num.nextInt(cards.size() - 1);
			value2 = num.nextInt(cards.size() - 1);

			cardVariable = (cards) cards.get(value2);
			cards.set(value2, cards.get(value1));
			cards.set(value1, cardVariable);
		}
	}
	/**Draws a card from the deck and removes it*/
	public cards getACard() {
		return cards.remove(0);
	}
	/**Gets the total size of the deck*/
	public int getTotalCards() {
		return cards.size();

	}
	/**In class test to make sure the deck return 52 random and non-repeated cards*/
	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		for(int i=0;i<52;i++){
		System.out.println(deck.getACard());}
	}

}
