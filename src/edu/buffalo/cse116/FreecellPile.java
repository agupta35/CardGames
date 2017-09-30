package edu.buffalo.cse116;

import java.util.ArrayList;


//FREE CELL PILES CAN ONLY HAVE ONE CARD OR ZERO CARDS IN THEM AT ALL TIMES


public class FreecellPile {
	private cards card1;
	private ArrayList<cards> freecellPile;

	public FreecellPile() {
		freecellPile.isEmpty();
	}
	
	public ArrayList<cards> getArrayList(){
		return freecellPile;
	}

	public boolean addCard(cards addCard) {
		if(freecellPile.isEmpty()){
			freecellPile.add(addCard);
			return true;
		}
		else{
			return false;
		}
	}

	public boolean removeTopCard() {
		if(freecellPile.isEmpty() == true){
			return false;
		}
		else if(freecellPile.isEmpty() != true){
			freecellPile.remove(0);
			return true;
		}
		else{
			return false;
		}
	}
}

