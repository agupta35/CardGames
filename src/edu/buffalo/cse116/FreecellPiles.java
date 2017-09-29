package edu.buffalo.cse116;

import java.util.ArrayList;

public class FreecellPiles {
	private cards card1;
	private static ArrayList<cards> freecellPile;

	public FreecellPiles(cards card1) {
		this.card1 = card1;
		card1=null;
		freecellPile.add(card1);

	}
	public ArrayList<cards> getArrayList(){
		return freecellPile;
	}

	public boolean addCard(cards addCard) {

		if (freecellPile.get(0) == null) {
			freecellPile.set(0,addCard);
			return true;
		} else {
			return false;
		}

	}

	public boolean removeTopCard() {
		return false;
	}uy
}
