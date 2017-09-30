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
		
		this.setTpile1(Tpile1); this.setTpile2(Tpile2); this.setTpile3(Tpile3); this.setTpile4(Tpile4);
		this.setTpile5(Tpile5); this.setTpile6(Tpile6); 
		
		this.setTpile7(Tpile7); this.setTpile8(Tpile8);
		
		this.setHpile1(Hpile1); this.setHpile2(Hpile2); this.setHpile3(Hpile3); this.setHpile4(Hpile4);
		this.setFpile1(Fpile1); this.setFpile2(Fpile2); this.setFpile3(Fpile3); this.setFpile4(Fpile4);
	}


	public TableauPileFC getTpile1() {
		return Tpile1;
	}


	public void setTpile1(TableauPileFC tpile1) {
		Tpile1 = tpile1;
	}


	public TableauPileFC getTpile2() {
		return Tpile2;
	}


	public void setTpile2(TableauPileFC tpile2) {
		Tpile2 = tpile2;
	}


	public TableauPileFC getTpile3() {
		return Tpile3;
	}


	public void setTpile3(TableauPileFC tpile3) {
		Tpile3 = tpile3;
	}


	public TableauPileFC getTpile4() {
		return Tpile4;
	}


	public void setTpile4(TableauPileFC tpile4) {
		Tpile4 = tpile4;
	}


	public TableauPileFC getTpile5() {
		return Tpile5;
	}


	public void setTpile5(TableauPileFC tpile5) {
		Tpile5 = tpile5;
	}


	public TableauPileFC getTpile6() {
		return Tpile6;
	}


	public void setTpile6(TableauPileFC tpile6) {
		Tpile6 = tpile6;
	}


	public TableauPileFC getTpile7() {
		return Tpile7;
	}


	public void setTpile7(TableauPileFC tpile7) {
		Tpile7 = tpile7;
	}


	public TableauPileFC getTpile8() {
		return Tpile8;
	}


	public void setTpile8(TableauPileFC tpile8) {
		Tpile8 = tpile8;
	}


	public HomecellPile getHpile1() {
		return Hpile1;
	}


	public void setHpile1(HomecellPile hpile1) {
		Hpile1 = hpile1;
	}


	public HomecellPile getHpile2() {
		return Hpile2;
	}


	public void setHpile2(HomecellPile hpile2) {
		Hpile2 = hpile2;
	}


	public HomecellPile getHpile3() {
		return Hpile3;
	}


	public void setHpile3(HomecellPile hpile3) {
		Hpile3 = hpile3;
	}


	public HomecellPile getHpile4() {
		return Hpile4;
	}


	public void setHpile4(HomecellPile hpile4) {
		Hpile4 = hpile4;
	}


	public FreecellPile getFpile1() {
		return Fpile1;
	}


	public void setFpile1(FreecellPile fpile1) {
		Fpile1 = fpile1;
	}


	public FreecellPile getFpile2() {
		return Fpile2;
	}


	public void setFpile2(FreecellPile fpile2) {
		Fpile2 = fpile2;
	}


	public FreecellPile getFpile3() {
		return Fpile3;
	}


	public void setFpile3(FreecellPile fpile3) {
		Fpile3 = fpile3;
	}


	public FreecellPile getFpile4() {
		return Fpile4;
	}


	public void setFpile4(FreecellPile fpile4) {
		Fpile4 = fpile4;
	}
	
}
