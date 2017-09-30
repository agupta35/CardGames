package edu.buffalo.cse116;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class BakersDozenTest {
	
	@Test 
	public void BakersDozenGameInstanceTest(){
		TableauPileBD tp1 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp2 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp3 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp4 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp5 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp6 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp7 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp8 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp9 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp10 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp11 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp12 = new TableauPileBD(null, null, null, null);
		TableauPileBD tp13 = new TableauPileBD(null, null, null, null);
		
		HomecellPile hc1 = new HomecellPile();
		HomecellPile hc2 = new HomecellPile();
		HomecellPile hc3 = new HomecellPile();
		HomecellPile hc4 = new HomecellPile();
		BakersDozen game  = new BakersDozen(tp1, tp2, tp3, tp4, tp5, tp6, tp7, tp8, tp9, tp10, tp11, tp12, tp13, hc1, hc2, hc3, hc4);
		
		assertEquals(tp1, game.getTpile1());
		assertEquals(tp2, game.getTpile2());
		assertEquals(tp3, game.getTpile3());
		assertEquals(tp4, game.getTpile4());
		assertEquals(tp5, game.getTpile5());
		assertEquals(tp6, game.getTpile6());
		assertEquals(tp7, game.getTpile7());
		assertEquals(tp8, game.getTpile8());
		assertEquals(tp9, game.getTpile9());
		assertEquals(tp10, game.getTpile10());
		assertEquals(tp11, game.getTpile11());
		assertEquals(tp12, game.getTpile12());
		assertEquals(tp13, game.getTpile13());
		
		assertEquals(hc1, game.getHpile1());
		assertEquals(hc2, game.getHpile2());
		assertEquals(hc3, game.getHpile3());
		assertEquals(hc4, game.getHpile4());
	}
	
	@Test
	public void Initial4CardsInTableauPileTest(){
		cards card1 = new cards(0, 1, "Black");
		cards card2 = new cards(1, 2, "Red");
		cards card3 = new cards(2, 3, "Red");
		cards card4 = new cards(3, 4, "Black");
		
		TableauPileBD tp1 = new TableauPileBD(card1, card2, card3, card4);
		ArrayList<cards> list = tp1.getTableauArrayList();
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
		assertNotNull(list.get(3));
		assertEquals(4, list.size());
	}
	
	@Test
	public void BDTableauPileAddCardIsIllegalOrLegalTest(){
		cards card5 = new cards(3, 2, "Black");
		cards card6 = new cards(2, 10, "Red");
		cards card7 = new cards(0, 8, "Black");
		cards card8 = new cards(1, 4, "Red");
		cards addCard = new cards(1,3, "Red");
		cards addCard1 = new cards(0, 8, "Black");
		cards addCard2 = new cards(1, 7, "Red");
		
		TableauPileBD tp2 = new TableauPileBD(card5, card6, card7, card8);
		assertTrue(tp2.addCard(addCard));
		assertFalse(tp2.addCard(addCard1));
		
		TableauPileBD tp3 = new TableauPileBD(card5, card6, card7, card8);
		tp3.removingTopCard();
		tp3.removingTopCard();
		tp3.removingTopCard();
		tp3.removingTopCard();
		
		assertFalse(tp3.addCard(addCard2));
	}
	
	@Test
	public void BDTableauPileAddCardIncreasesSizeTest(){
		cards card9 =  new cards(0, 10, "Black");
		cards card10 =  new cards(0, 9, "Black");
		cards card11 =  new cards(0, 7, "Black");
		cards card12 =  new cards(0, 1, "Black");
		cards addCard3 = new cards(1, 2, "Red");
		
		TableauPileBD tp4 = new TableauPileBD(card9, card10, card11, card12);
		assertEquals(4, tp4.getTableauArrayList().size());
		if(tp4.addCard(addCard3)){;
		assertEquals(5, tp4.getTableauArrayList().size());
		}
	}
	
	@Test
	public void BDTableauPileRemovingTopCardIsIllegalOrLegalTest(){
		cards card13 = new cards(0,11,"Black");
		cards card14 = new cards(3, 9, "Black");
		cards card15 = new cards(2, 3, "Red");
		cards card16 = new cards(1, 2, "Red");
		
		TableauPileBD tp5 = new TableauPileBD(card13, card14, card15, card16);
		assertTrue(tp5.removingTopCard());
		
		TableauPileBD tp6 = new TableauPileBD(card13, card14, card15, card16);
		tp6.removingTopCard();
		tp6.removingTopCard();
		tp6.removingTopCard();
		tp6.removingTopCard();
		
		assertFalse(tp6.removingTopCard());
	}
	
	@Test
	public void BDTableauPileRemovingTopCardDecreasesSizeTest(){
		cards card13 = new cards(0,11,"Black");
		cards card14 = new cards(3, 9, "Black");
		cards card15 = new cards(2, 3, "Red");
		cards card16 = new cards(1, 2, "Red");
		
		TableauPileBD tp5 = new TableauPileBD(card13, card14, card15, card16);
		assertEquals(4, tp5.getTableauArrayList().size());
		if(tp5.removingTopCard()){
			assertEquals(3,tp5.getTableauArrayList().size());
		}
	}
	
	@Test
	public void Initial0CardsInBDHomeCellPileTest(){
		HomecellPile hc1 = new HomecellPile();
		assertEquals(0,hc1.getHomecellArrayList().size());
	}
	
	@Test
	public void BDHomeCellPileAddCardIsIllegalOrLegalTest(){
		cards AceClubs = new cards(0, 0, "Black");
		cards AceDiamonds = new cards(1, 0, "Red");
		cards AceHeart = new cards(2, 0, "Red");
		cards AceSpades = new cards(3, 0, "Black");
		
		cards twoClubs = new cards(0, 1, "Black");
		cards twoDiamonds = new cards(1, 1, "Red");
		cards twoHeart = new cards(2, 1, "Red");
		cards twoSpades = new cards(3, 1, "Black");
		
		cards fiveHeart = new cards(2, 4, "Red");
		
		HomecellPile hc2 = new HomecellPile();
		assertTrue(hc2.addCard(AceClubs));
		assertEquals(AceClubs, hc2.getHomecellArrayList().get(0));
		assertFalse(hc2.addCard(AceDiamonds));
		assertFalse(hc2.addCard(twoHeart));
		assertTrue(hc2.addCard(twoClubs));
		
		HomecellPile hc3 = new HomecellPile();
		assertTrue(hc3.addCard(AceDiamonds));
		assertEquals(AceDiamonds, hc3.getHomecellArrayList().get(0));
		assertFalse(hc3.addCard(AceClubs));
		assertFalse(hc3.addCard(twoClubs));
		assertTrue(hc3.addCard(twoDiamonds));
		
		HomecellPile hc4 = new HomecellPile();
		assertTrue(hc4.addCard(AceHeart));
		assertEquals(AceHeart, hc4.getHomecellArrayList().get(0));
		assertFalse(hc4.addCard(AceHeart));
		assertFalse(hc4.addCard(fiveHeart));
		assertTrue(hc4.addCard(twoHeart));
		
		HomecellPile hc5 = new HomecellPile();
		assertTrue(hc5.addCard(AceSpades));
		assertEquals(AceSpades, hc5.getHomecellArrayList().get(0));
		assertFalse(hc5.addCard(AceSpades));
		assertFalse(hc5.addCard(twoHeart));
		assertTrue(hc5.addCard(twoSpades));
		
		HomecellPile hc6 = new HomecellPile();
		assertFalse(hc6.addCard(fiveHeart));
	}
	
	@Test
	public void BDHomeCellPileAddCardIncreasesSizeTest(){
		cards AceClubs = new cards(0, 0, "Black");
		cards twoClubs = new cards(0, 1, "Black");
		
		HomecellPile hc7 = new HomecellPile();
		assertEquals(0, hc7.getHomecellArrayList().size());
		hc7.addCard(AceClubs);
		assertEquals(1, hc7.getHomecellArrayList().size());
		hc7.addCard(twoClubs);
		assertEquals(2, hc7.getHomecellArrayList().size());
	}
	
	@Test
	public void BDHomeCellPileRemovingTopCardIsIllegalOrLegalTest(){
		cards AceClubs = new cards(0, 0, "Black");
		cards twoClubs = new cards(0, 1, "Black");
		
		HomecellPile hc8 = new HomecellPile();
		assertFalse(hc8.removeingTopCard());
		
		HomecellPile hc9 = new HomecellPile();
		hc8.addCard(AceClubs);
		hc8.addCard(twoClubs);
		assertFalse(hc9.removeingTopCard());
	}
	
	
}
