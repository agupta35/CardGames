package edu.buffalo.cse116;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class DeckOfCardsTest {

	@Test
	public void testDeckSize() {
		DeckOfCards deck = new DeckOfCards();
		assertEquals(52, deck.getTotalCards());
	}

	@Test
	public void testSuit() {
		DeckOfCards deck = new DeckOfCards();
		ArrayList<String> testDiamond = new ArrayList<String>();
		ArrayList<String> testHearts = new ArrayList<String>();
		ArrayList<String> testClubs = new ArrayList<String>();
		ArrayList<String> testSpades = new ArrayList<String>();
		for (int i = 0; i < 52; i++) {
			String suit = Integer.toString(deck.getACard().getSuit());
			if (suit.equals("Diamond")) {
				testDiamond.add(suit);
				assertEquals(13, testDiamond.size());
			} else if (suit.equals("Hearts")) {
				testHearts.add(suit);
				assertEquals(13, testHearts.size());
			} else if (suit.equals("Clubs")) {
				testClubs.add(suit);
				assertEquals(13, testClubs.size());
			} else if (suit.equals("Spades")) {
				testSpades.add(suit);
				assertEquals(13, testSpades.size());
			}
		}
	}

	@Test
	public void testRank() {
		DeckOfCards deck = new DeckOfCards();
		for (int i = 0; i < 52; i++) {
			String suit = deck.toString();
			if(suit.contains("Ace")){
				assertEquals(4, suit.length());
			}
			for(int j=2; j<11;j++){
				if(suit.contains(Integer.toString(j))){
					assertEquals(20,suit.length());
				}
			}
			if(suit.contains("Jack")){
				assertEquals(4, suit.length());
			}
			if(suit.contains("Queen")){
				assertEquals(4, suit.length());
			}
			if(suit.contains("King")){
				assertEquals(4, suit.length());
			}
		
		}
	}
}
