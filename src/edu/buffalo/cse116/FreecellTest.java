package edu.buffalo.cse116;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class FreecellTest {
	
	@Test 
	public void FreecellGameInstanceTest(){
		TableauPileFC tp1 = new TableauPileFC(null, null, null, null,null,null,null);
		TableauPileFC tp2 = new TableauPileFC(null, null, null, null,null,null,null);
		TableauPileFC tp3 = new TableauPileFC(null, null, null, null,null,null,null);
		TableauPileFC tp4 = new TableauPileFC(null, null, null, null,null,null,null);
		TableauPileFC tp5 = new TableauPileFC(null, null, null, null,null,null);
		TableauPileFC tp6 = new TableauPileFC(null, null, null, null,null,null);
		TableauPileFC tp7 = new TableauPileFC(null, null, null, null,null,null);
		TableauPileFC tp8 = new TableauPileFC(null, null, null, null,null,null);

		
		
		HomecellPile hc1 = new HomecellPile();
		HomecellPile hc2 = new HomecellPile();
		HomecellPile hc3 = new HomecellPile();
		HomecellPile hc4 = new HomecellPile();
		
		FreecellPile fc1 = new FreecellPile();
		FreecellPile fc2 = new FreecellPile();
		FreecellPile fc3 = new FreecellPile();
		FreecellPile fc4 = new FreecellPile();
		
		
		Freecell game  = new Freecell(tp1, tp2, tp3, tp4, tp5, tp6, tp7, tp8, hc1, hc2, hc3, hc4, fc1, fc2, fc3, fc4);
		
		
		assertEquals(tp1, game.getTpile1());
		assertEquals(tp2, game.getTpile2());
		assertEquals(tp3, game.getTpile3());
		assertEquals(tp4, game.getTpile4());
		assertEquals(tp5, game.getTpile5());
		assertEquals(tp6, game.getTpile6());
		assertEquals(tp7, game.getTpile7());
		assertEquals(tp8, game.getTpile8());
		
		
		assertEquals(hc1, game.getHpile1());
		assertEquals(hc2, game.getHpile2());
		assertEquals(hc3, game.getHpile3());
		assertEquals(hc4, game.getHpile4());
		
		
		assertEquals(fc1, game.getFpile1());
		assertEquals(fc2, game.getFpile2());
		assertEquals(fc3, game.getFpile3());
		assertEquals(fc4, game.getFpile4());
	}
	
	@Test
	public void Initial7or6CardsInTableauPileTest(){
		cards card1 = new cards(0, 1, "Black");
		cards card2 = new cards(1, 2, "Red");
		cards card3 = new cards(2, 3, "Red");
		cards card4 = new cards(3, 4, "Black");
		cards card5 = new cards(1, 5, "Red");
		cards card6 = new cards(2, 7, "Red");
		cards card7 = new cards(3, 9, "Black");
		
		TableauPileFC tp1 = new TableauPileFC(card1, card2, card3, card4, card5,card6,card7);
		ArrayList<cards> list = tp1.getTableauArrayList();
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
		assertNotNull(list.get(3));
		assertNotNull(list.get(4));
		assertNotNull(list.get(5));
		assertNotNull(list.get(6));
	//	assertEquals(7, list.size());
		
		TableauPileFC tp2 = new TableauPileFC(card1, card2, card3, card4, card5,card6);
		ArrayList<cards> list2=tp2.getTableauArrayList();
		assertNotNull(list2.get(0));
		assertNotNull(list2.get(1));
		assertNotNull(list2.get(2));
		assertNotNull(list2.get(3));
		assertNotNull(list2.get(4));
		assertNotNull(list2.get(5));
		assertEquals(6, list2.size());
	
	
	}
	
	@Test
	public void FCTableauPileAddCardIsIllegalOrLegalTest(){
		cards card8 = new cards(2, 5,"Red");
		cards card9 = new cards(2, 6,"Red");
		cards card10 = new cards(3, 2, "Black");
		cards card11 = new cards(2, 10, "Red");
		cards card12 = new cards(0, 8, "Black");
		cards card13 = new cards(1, 4, "Red");
		
		cards addCard = new cards(1,3, "Black"); // only black can 
		cards addCard1 = new cards(1, 3, "Red");
		cards addCard2 = new cards(1, 7, "Red");
		
		TableauPileFC tp2 = new TableauPileFC(card8,card9,card10, card11, card12, card13);
		assertTrue("card should be added",tp2.addCard(addCard));
		assertFalse("The color of the card added should be different than the current card.",tp2.addCard(addCard1));
		
		TableauPileFC tp3 = new TableauPileFC(card8,card9,card10, card11, card12, card13);
		tp3.removingTopCard();
		tp3.removingTopCard();
		tp3.removingTopCard();
		tp3.removingTopCard();
		tp3.removingTopCard();
		tp3.removingTopCard();
		
		assertTrue(tp3.addCard(addCard2));
	}
	
	@Test
	public void FCTableauPileAddCardIncreasesSizeTest(){
		cards card14 = new cards(2, 5,"Red");
		cards card15 = new cards(2, 6,"Red");
		cards card16 =  new cards(0, 10, "Black");
		cards card17 =  new cards(0, 9, "Black");
		cards card18 =  new cards(0, 7, "Black");
		cards card19 =  new cards(0, 1, "Black");
		cards addCard3 = new cards(1, 2, "Red");
		
		TableauPileFC tp4 = new TableauPileFC(card14, card15, card16, card17, card18,card19);
		assertEquals(6, tp4.getTableauArrayList().size());
		if(tp4.addCard(addCard3)){;
		assertEquals(7, tp4.getTableauArrayList().size());
		}
	}
	
	@Test
	public void FCTableauPileRemovingTopCardIsIllegalOrLegalTest(){
		cards card20 = new cards(2, 5,"Red");
		cards card21 = new cards(2, 6,"Red");
		cards card22 = new cards(0,11,"Black");
		cards card23 = new cards(3, 9, "Black");
		cards card24 = new cards(2, 3, "Red");
		cards card25 = new cards(1, 2, "Red");
		
		TableauPileFC tp5 = new TableauPileFC(card20, card21, card22, card23, card24,card25);
		assertTrue(tp5.removingTopCard());
		
		TableauPileFC tp6 = new TableauPileFC(card20, card21, card22, card23, card24,card25);
		tp6.removingTopCard();
		tp6.removingTopCard();
		tp6.removingTopCard();
		tp6.removingTopCard();
		
		assertTrue(tp6.removingTopCard());
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
