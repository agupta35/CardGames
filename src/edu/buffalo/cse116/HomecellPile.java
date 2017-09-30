package edu.buffalo.cse116;

import java.util.ArrayList;

public class HomecellPile {
	
	private ArrayList<cards> homecellPile = new ArrayList<cards>();
	
	public HomecellPile(){
		homecellPile.isEmpty();
	}
	
	public ArrayList<cards> getHomecellArrayList(){
		return homecellPile;
	}
	
	public boolean addCard(cards addCard){
		if(homecellPile.isEmpty() && addCard.getRank() == 0 && addCard.getSuit() == 0){
			homecellPile.add(addCard);
			return true;
		}
		else if(homecellPile.isEmpty() && addCard.getRank() == 0 && addCard.getSuit() == 1){
			homecellPile.add(addCard);
			return true;
		}
		else if(homecellPile.isEmpty() && addCard.getRank() == 0 && addCard.getSuit() == 2){
			homecellPile.add(addCard);
			return true;
		}
		else if(homecellPile.isEmpty() && addCard.getRank() == 0 && addCard.getSuit() == 3){
			homecellPile.add(addCard);
			return true;
		}
		else if(homecellPile.isEmpty() != true && addCard.getRank() != 0 && addCard.getSuit() == homecellPile.get(homecellPile.size()-1).getSuit() && addCard.getRank() == homecellPile.get(homecellPile.size()-1).getRank()+1){
			homecellPile.add(addCard);
			return true;
		}
		else{
			return false;
		}
	}
	public boolean removeingTopCard(){
		return false;
	}
}
