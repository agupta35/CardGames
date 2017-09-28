package edu.buffalo.cse116;

public class cards {
	
	private int suit;
	private int rank;
	
	 private static String[] suits = { "Clubs","Diamons","Hearts","Spades" };
	 private static String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	 
	 public cards(int suit, int rank){
	         this.rank=rank;
	         this.suit=suit;
	 }
		public String toString(){
	           return ranks[rank] + " of " + suits[suit];
	     }
	     public int getRank() {
	          return rank;
	     }
	     public int getSuit() {
	         return suit;
	     }
	 
  }