package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_JACKIE;

public class Card {
    static char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    private int suit;
    private int cardValue;
    static String[] face = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    int score;

    //getter & setters

    public char[] getSuits() {
        return suits;
    }

    public void setSuits(char[] suits) {
        this.suits = suits;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public String[] getFace() {
        return face;
    }

    public void setFace(String[] face) {
        this.face = face;
    }

    //constructors

    public Card() {
    }

    public Card(int suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public int valueOfCard() {
        int valueOfCard = cardValue + 1;
        if (cardValue >= 10) {
            valueOfCard = 10;
        }
        return valueOfCard;
    }


//        if (face[cardValue] = "Jack" || face[cardValue] = "Queen" || face[cardValue] = "King") { //is it equal to King,Queen,Jack in the string?
//            valueOfCard = 10;
//        } else if (face[cardValue] = "Ace") { //is it equal to Ace in the string?
//            valueOfCard = 1;
//        } else {
//            for (int i = 2; i < 10; i++) {
//                valueOfCard = i; //counts through 2 to 9 and assigns the value of that count
//            }
//        }



    @Override
    public String toString() {
        return Card.suits[this.suit] + " | " + Card.face[this.cardValue];
    }

    //methods
}