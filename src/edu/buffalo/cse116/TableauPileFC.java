package edu.buffalo.cse116;

import java.util.ArrayList;

public class TableauPileFC{
	
	private cards _card1;
	private cards _card2;
	private cards _card3;
	private cards _card4;
	private cards _card5;
	private cards _card6;
	private cards _card7;
	
	//one in front is card7, one in the back is card1
	
	private ArrayList<cards> tableauPile = new ArrayList<cards>();

	
	public TableauPileFC(cards card1, cards card2, cards card3, cards card4,cards card5,cards card6,cards card7){
		
		this._card1 = card1;
        tableauPile.add(_card1);
        
        this._card2 = card2;
        tableauPile.add(_card2);
        
        this._card3 = card3;
        tableauPile.add(_card3);
        
        this._card4 = card4;
        tableauPile.add(_card4);
        
        this._card5 = card5;
        tableauPile.add(_card5);
        
        this._card6 = card6;
        tableauPile.add(_card6);
        
        this._card7 = card7;
        tableauPile.add(_card7);
	}
	
	public TableauPileFC(cards card1, cards card2, cards card3, cards card4,cards card5,cards card6){
		
		this._card1 = card1;
		tableauPile.add(_card1);
    
		this._card2 = card2;
		tableauPile.add(_card2);
    
		this._card3 = card3;
		tableauPile.add(_card3);
    
		this._card4 = card4;
		tableauPile.add(_card4);
        
		this._card5 = card5;
		tableauPile.add(_card5);
    
		this._card6 = card6;
		tableauPile.add(_card6);
	}

	public ArrayList<cards> getTableauArrayList(){
		return tableauPile;
	}

	public boolean addCard(cards addCard){
		if(tableauPile.isEmpty()){
			tableauPile.add(addCard);
			return true;
		}
		else if(tableauPile.get(tableauPile.size()-1).getRank() == addCard.getRank()+1 && tableauPile.get(tableauPile.size()-1).getColor()!=addCard.getColor()){
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