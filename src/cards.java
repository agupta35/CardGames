

public class cards {
	/**
	 * Instance variables for color, suit, and rank
	 */
	private int suit;
	private int rank;
	private String color;
	
	/**
	 * Two array instances with all the suits and all the ranks.
	 */
	 private static String[] suits = { "Clubs","Diamonds","Hearts","Spades" };
	 private static String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	 
	 /**
	  * Card Constructor
	  * @param suit
	  * @param rank
	  * @param color
	  */
	 public cards(int suit, int rank, String color){
	         this.rank=rank;
	         this.suit=suit;
	         this.color=color;
	 }
	 /**
	  * @return A string giving the color, rank, and suit
	  */
		public String toString(){
			if(suits[suit].equals("Diamonds") || suits[suit].equals("Hearts")){
				color = "Red";
	           return color+ ": " + ranks[rank] + " of " + suits[suit];
			} else {
				color = "Black";
			return color+ ": " + ranks[rank] + " of " + suits[suit];
			}
	     }
		/**
		 * @return the rank for the given card
		 */
	     public int getRank() {
	          return rank;
	     }
	     /**
		 * @return the suit for the given card
		 */
	     public int getSuit() {
	         return suit;
	     }
	     /**
		 * @return the color for the given card
		 */
	     public String getColor(){
	    	 return color;
	     }
	     
	 
  }

