package edu.buffalo.cse116;

import java.util.ArrayList;

public class TableauPileBD{
	
	private cards _card1;
	private cards _card2;
	private cards _card3;
	private cards _card4;
	//one in front is card4, one in the back is card1
	
	public static ArrayList<cards> tableauPile = new ArrayList<cards>();
	public static cards theRemovedCard;
	
	public TableauPileBD(cards card1, cards card2, cards card3, cards card4){
        this._card1 = card1;
        tableauPile.add(_card1);
        
        this._card2 = card2;
        tableauPile.add(_card2);
        
        this._card3 = card3;
        tableauPile.add(_card3);
        
        this._card4 = card4;
        tableauPile.add(_card4);
	}
	public ArrayList<cards> getTableauArrayList(){
		return tableauPile;
	}
	
	public boolean addCard(cards addCard){
		if(tableauPile.isEmpty()){
			return false;
		}
		else if(tableauPile.get(tableauPile.size()-1).getRank() == addCard.getRank()+1){
			tableauPile.add(addCard);
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean removingTopCard(){
		if(tableauPile.isEmpty()){
			return false;
		}
		else{
			tableauPile.remove(tableauPile.size()-1);
			return true;
		}
	}	
}