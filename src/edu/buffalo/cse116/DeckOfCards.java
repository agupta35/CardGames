package edu.buffalo.cse116;

import java.util.Random;
import java.util.ArrayList;

public class DeckOfCards {
	private ArrayList<cards> cards;

	public DeckOfCards()

	{
		Random generator = new Random();
		cards = new ArrayList<cards>();
		int value1;
		int value2;
		cards variable;

		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 0; rank <= 12; rank++) {
				cards.add(new cards(suit, rank));
			}
		}
		for (int i = 0; i < 100; i++) {
			value1 = generator.nextInt(cards.size() - 1);
			value2 = generator.nextInt(cards.size() - 1);

			variable = (cards) cards.get(value2);
			cards.set(value2, cards.get(value1));
			cards.set(value1, variable);
		}
	}

	public cards drawFromDeck() {
		return cards.remove(0);
	}

	public int getTotalCards() {
		return cards.size();

	}

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		cards test;
		while (deck.getTotalCards() > 0) {
			test = deck.drawFromDeck();
			System.out.println(test.toString());
		}
	}

}
