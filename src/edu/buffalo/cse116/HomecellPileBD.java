package edu.buffalo.cse116;

public class HomecellPileBD {
	
	private static cards[] homecellPile;
	
	public HomecellPileBD(){
		homecellPile = new cards[13]; 
	}
	
	public boolean addCard(cards addCard){
		
		for(int i = 0; i < homecellPile.length; i++){
			if(homecellPile[i] == null && homecellPile[i-1].getRank()+1 == addCard.getRank()){
				homecellPile[i] = addCard;
				return true;
			}
		}
		return false;
		
	}
	
	public boolean removeTopCard(){
		return false;
	}
}
