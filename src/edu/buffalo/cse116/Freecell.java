package edu.buffalo.cse116;

public class Freecell{
	
	private TableauPileFC Tpile1; //These are the 6 or 7 tableau piles for a Freecell game
	private TableauPileFC Tpile2;
	private TableauPileFC Tpile3;
	private TableauPileFC Tpile4;
	private TableauPileFC Tpile5;// make a count of the card parameters going in
	private TableauPileFC Tpile6;
	private TableauPileFC Tpile7;
	private TableauPileFC Tpile8;
	
	
	private HomecellPile Hpile1; //These are the 4 homecell piles for a bakers Freecell game
	private HomecellPile Hpile2;
	private HomecellPile Hpile3;
	private HomecellPile Hpile4;
	
	private FreecellPile Fpile1;// These are 4 freecells for the freecell game.
	private FreecellPile Fpile2;
	private FreecellPile Fpile3;
	private FreecellPile Fpile4;

	
	public Freecell(TableauPileFC Tpile1, TableauPileFC Tpile2, TableauPileFC Tpile3, TableauPileFC Tpile4, 
			TableauPileFC Tpile5,TableauPileFC Tpile6, TableauPileFC Tpile7, TableauPileFC Tpile8,  HomecellPile Hpile1, HomecellPile Hpile2, HomecellPile Hpile3,
			HomecellPile Hpile4,FreecellPile Fpile1,FreecellPile Fpile2,FreecellPile Fpile3,FreecellPile Fpile4){
		
		this.Tpile1 = Tpile1; this.Tpile2 = Tpile2; this.Tpile3 = Tpile3; this.Tpile4 = Tpile4;
		this.Tpile5 = Tpile5; this.Tpile6 = Tpile6; 
		
		this.Tpile7 = Tpile7; this.Tpile8=Tpile8;
		
		this.Hpile1 = Hpile1; this.Hpile2 = Hpile2; this.Hpile3 = Hpile3; this.Hpile4 = Hpile4;
		this.Fpile1 = Fpile1; this.Fpile2 = Fpile2; this.Fpile3 = Fpile3; this.Fpile4 = Fpile4;
	}
	
}
