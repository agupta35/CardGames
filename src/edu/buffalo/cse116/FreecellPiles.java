package edu.buffalo.cse116;


public class FreecellPiles{
	private static cards[] freecellPile;
public FreecellPiles(){
	freecellPile = new cards[0]; 
}

public boolean addCard(cards addCard){
	
	//	int i = 0;
		if(freecellPile[0] == null){
			freecellPile[0] = addCard;
			return true;
		}else{
			return false;
		}
	
	
	
}

public boolean removeTopCard(){
	return false;
}

}

