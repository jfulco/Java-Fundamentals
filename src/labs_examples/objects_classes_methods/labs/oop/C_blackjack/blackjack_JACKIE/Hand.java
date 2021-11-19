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
    public int score() {
        handValue = 0;
        for (int i = 0; i < cards.toArray().length; i++) { //iterate through the indexes of the cards ArrayList
            // (which is just a bunch of Card objects that all have access to the valueOfCard method)
            int value = cards.get(i).valueOfCard();
            handValue += value;     //add the value of the card to handValue;
        }
//        for() how to constructor for each to make for loop better ^^^^^^^^^^^^^^^^^^^
        return handValue;           //return the handvalue when the method score is called
    }

    public boolean isHandOver21(){          //True or false, is handValue greater than 21 or less than 21?
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

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }
}
