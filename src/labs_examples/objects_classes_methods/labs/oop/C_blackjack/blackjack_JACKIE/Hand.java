package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_JACKIE;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();
    private int handValue;

    //constructors
    public Hand() {
    }

    public ArrayList<Card> Hand(ArrayList<Card> cards) {
        this.cards = cards;
        return cards;
    }

    //methods
    public int getHandValue() {
        handValue = 0;
        for (int i = 0; i < cards.toArray().length; i++) { //iterate through the indexes of the cards ArrayList
            // (which is just a bunch of Card objects that all have access to the valueOfCard method)
            int value = cards.get(i).valueOfCard();
            handValue += value;     //add the value of the card to handValue;
        }
        return handValue;           //return the handvalue when the method is called
    }

    public boolean isHandOver21(){
        this.handValue = handValue;//True or false, is handValue greater than 21 or less than 21?
        if (handValue > 21){
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public void addCard(Card card) {

        cards.add(card);

    }


    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }
}
