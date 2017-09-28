package edu.buffalo.cse116;

public class TableauPileFC{
	
	private cards _card1;
	private cards _card2;
	private cards _card3;
	private cards _card4;
	private cards _card5;
	private cards _card6;
	private cards _card7;
	
	//one in front is card7, one in the back is card1
	
	public static cards[] tableauPile = new cards[52];
	public static cards theRemovedCard;
	
	public TableauPileFC(cards card1, cards card2, cards card3, cards card4,cards card5,cards card6,cards card7){
		
        this._card1 = card1;
        tableauPile[0] = _card1;
        
        this._card2 = card2;
        tableauPile[1] = _card2;
        
        this._card3 = card3;
        tableauPile[2] = _card3;
        
        this._card4 = card4;
        tableauPile[3] = _card4;
        
        this._card5 = card5;
        tableauPile[4] = _card5;
        
        this._card6 = card6;
        tableauPile[5] = _card6;
        
        this._card7 = card7;
        tableauPile[6] = _card7;
	}
public TableauPileFC(cards card1, cards card2, cards card3, cards card4,cards card5,cards card6){
		
        this._card1 = card1;
        tableauPile[0] = _card1;
        
        this._card2 = card2;
        tableauPile[1] = _card2;
        
        this._card3 = card3;
        tableauPile[2] = _card3;
        
        this._card4 = card4;
        tableauPile[3] = _card4;
        
        this._card5 = card5;
        tableauPile[4] = _card5;
        
        this._card6 = card6;
        tableauPile[5] = _card6;
        
      
	}
	
	public boolean addCard(cards addCard){
		for(int i = 0; i < tableauPile.length; i++){
			if(tableauPile[i] == null && tableauPile[i-1].getRank() == addCard.getRank()+1){
				tableauPile[i] = addCard;
				return true;
			}
		}
		return false;
	}
	
	public boolean removingTopCard(){
		for(int i = 0; i < tableauPile.length; i++){
			if(tableauPile[i] == null){ 				//This is the first spot in the array where there is no card
				theRemovedCard = tableauPile[i-1];		//The index previous to it is where the top card is and it is stored in theRemovedCard
				tableauPile[i-1] = null;				//Then by setting that index to null it no longer is in the pile
				return true;
			}											
		}
		return false;
	}	
}