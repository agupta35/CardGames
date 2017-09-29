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
        
     //   tableauPile[0] = _card1;
        
        this._card2 = card2;
        tableauPile.add(_card2);
        
     //   tableauPile[1] = _card2;
        
        this._card3 = card3;
        tableauPile.add(_card3);
        
     //   tableauPile[2] = _card3;
        
        this._card4 = card4;
        tableauPile.add(_card4);
        
     //   tableauPile[3] = _card4;
 
	}
	
	public boolean addCard(cards addCard){
		for(int i = 0; i < tableauPile.size(); i++){
			if(tableauPile.get(i) == null && tableauPile.get(i-1).getRank() == addCard.getRank()+1){
				tableauPile.set(i, addCard);
				return true;
			}
		}
		return false;
	}
	
	public boolean removingTopCard(){
		for(int i = 0; i < tableauPile.size(); i++){
			if(tableauPile.get(i) == null){ 				//This is the first spot in the array where there is no card
				theRemovedCard = tableauPile.get(i-1);		//The index previous to it is where the top card is and it is stored in theRemovedCard
				tableauPile.set(i, null);				//Then by setting that index to null it no longer is in the pile
				return true;
			}											
		}
		return false;
	}	
}