package edu.buffalo.cse116;

public class BakersDozen{
	
	private TableauPileBD Tpile1; //These are the 13 tableau piles for a bakers dozen game
	private TableauPileBD Tpile2;
	private TableauPileBD Tpile3;
	private TableauPileBD Tpile4;
	private TableauPileBD Tpile5;
	private TableauPileBD Tpile6;
	private TableauPileBD Tpile7;
	private TableauPileBD Tpile8;
	private TableauPileBD Tpile9;
	private TableauPileBD Tpile10;
	private TableauPileBD Tpile11;
	private TableauPileBD Tpile12;
	private TableauPileBD Tpile13;
	
	private HomecellPileBD Hpile1; //These are the 4 homecell piles for a bakers dozen game
	private HomecellPileBD Hpile2;
	private HomecellPileBD Hpile3;
	private HomecellPileBD Hpile4;
	
	public BakersDozen(TableauPileBD Tpile1, TableauPileBD Tpile2, TableauPileBD Tpile3, TableauPileBD Tpile4, 
			TableauPileBD Tpile5,TableauPileBD Tpile6, TableauPileBD Tpile7, TableauPileBD Tpile8, 
			TableauPileBD Tpile9, TableauPileBD Tpile10, TableauPileBD Tpile11, TableauPileBD Tpile12,
			TableauPileBD Tpile13, HomecellPileBD Hpile1, HomecellPileBD Hpile2, HomecellPileBD Hpile3,
			HomecellPileBD Hpile4){
		
		this.Tpile1 = Tpile1; this.Tpile2 = Tpile2; this.Tpile3 = Tpile3; this.Tpile4 = Tpile4;
		this.Tpile5 = Tpile5; this.Tpile6 = Tpile6; this.Tpile7 = Tpile7; this.Tpile8 = Tpile8;
		this.Tpile9 = Tpile9; this.Tpile10 = Tpile10; this.Tpile11 = Tpile11; this.Tpile12 = Tpile12;
		this.Tpile13 = Tpile13;
		
		this.Hpile1 = Hpile1; this.Hpile2 = Hpile2; this.Hpile3 = Hpile3; this.Hpile4 = Hpile4;  
	}
	
}