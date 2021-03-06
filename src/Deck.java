
import java.util.ArrayList;
import javax.swing.ImageIcon;

/*
 * Playing card deck:
 * - 52 cards
 * - no jokers
 */
public class Deck {

	static final int MAX = 52;	
	//ArrayList deck
	protected ArrayList<Card> deck = new ArrayList<Card>();

	/*
	 * initiate and create the deck of 52 cards default one deck
	 */
	public Deck() {
		int index = 0;	
		for(Card.FaceValue faceValue : Card.FaceValue.values())
			for(Card.Suit suit: Card.Suit.values()) {
				index++;
				deck.add(new Card(suit, faceValue, new ImageIcon("pictures/" + index + ".png").getImage()));	
			}	
	}

	/*
	 * deal a card from a deck
	 */
	public Card dealCard() throws DeckEmptyException {
		//remove dealed card from a deck 

		int index = (int)(Math.random()*deck.size()); 
		if(deck==null||deck.size()==0){
			throw( new DeckEmptyException());
		}
		return deck.remove(index);		

	}
	public boolean isSingleDeck(){
		return true;
	}

}
