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
	
	private HomecellPile Hpile1; //These are the 4 homecell piles for a bakers dozen game
	private HomecellPile Hpile2;
	private HomecellPile Hpile3;
	private HomecellPile Hpile4;
	
	public BakersDozen(TableauPileBD Tpile1, TableauPileBD Tpile2, TableauPileBD Tpile3, TableauPileBD Tpile4, 
			TableauPileBD Tpile5,TableauPileBD Tpile6, TableauPileBD Tpile7, TableauPileBD Tpile8, 
			TableauPileBD Tpile9, TableauPileBD Tpile10, TableauPileBD Tpile11, TableauPileBD Tpile12,
			TableauPileBD Tpile13, HomecellPile Hpile1, HomecellPile Hpile2, HomecellPile Hpile3,
			HomecellPile Hpile4){
		
		this.setTpile1(Tpile1); this.setTpile2(Tpile2); this.setTpile3(Tpile3); this.setTpile4(Tpile4);
		this.setTpile5(Tpile5); this.setTpile6(Tpile6); this.setTpile7(Tpile7); this.setTpile8(Tpile8);
		this.setTpile9(Tpile9); this.setTpile10(Tpile10); this.setTpile11(Tpile11); this.setTpile12(Tpile12);
		this.setTpile13(Tpile13);
		
		this.setHpile1(Hpile1); this.setHpile2(Hpile2); this.setHpile3(Hpile3); this.setHpile4(Hpile4);  
	}

	public TableauPileBD getTpile1() {
		return Tpile1;
	}

	public void setTpile1(TableauPileBD tpile1) {
		Tpile1 = tpile1;
	}

	public TableauPileBD getTpile2() {
		return Tpile2;
	}

	public void setTpile2(TableauPileBD tpile2) {
		Tpile2 = tpile2;
	}

	public TableauPileBD getTpile3() {
		return Tpile3;
	}

	public void setTpile3(TableauPileBD tpile3) {
		Tpile3 = tpile3;
	}

	public TableauPileBD getTpile4() {
		return Tpile4;
	}

	public void setTpile4(TableauPileBD tpile4) {
		Tpile4 = tpile4;
	}

	public TableauPileBD getTpile5() {
		return Tpile5;
	}

	public void setTpile5(TableauPileBD tpile5) {
		Tpile5 = tpile5;
	}

	public TableauPileBD getTpile6() {
		return Tpile6;
	}

	public void setTpile6(TableauPileBD tpile6) {
		Tpile6 = tpile6;
	}

	public TableauPileBD getTpile7() {
		return Tpile7;
	}

	public void setTpile7(TableauPileBD tpile7) {
		Tpile7 = tpile7;
	}

	public TableauPileBD getTpile8() {
		return Tpile8;
	}

	public void setTpile8(TableauPileBD tpile8) {
		Tpile8 = tpile8;
	}

	public TableauPileBD getTpile9() {
		return Tpile9;
	}

	public void setTpile9(TableauPileBD tpile9) {
		Tpile9 = tpile9;
	}

	public TableauPileBD getTpile10() {
		return Tpile10;
	}

	public void setTpile10(TableauPileBD tpile10) {
		Tpile10 = tpile10;
	}

	public TableauPileBD getTpile11() {
		return Tpile11;
	}

	public void setTpile11(TableauPileBD tpile11) {
		Tpile11 = tpile11;
	}

	public TableauPileBD getTpile12() {
		return Tpile12;
	}

	public void setTpile12(TableauPileBD tpile12) {
		Tpile12 = tpile12;
	}

	public TableauPileBD getTpile13() {
		return Tpile13;
	}

	public void setTpile13(TableauPileBD tpile13) {
		Tpile13 = tpile13;
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
	
}