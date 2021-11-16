package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_JACKIE;

import java.util.ArrayList;

public class Deck {
    private Card[] deck = new Card[52];
    private ArrayList<Integer> usedCards = new ArrayList<Integer>();

    //getters & setters
    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }


    //constructors
    public Deck() {
    }


    //methods
    public void populateCards() {
        int counter = 0;
        for (int suit = 0; suit < 4; suit++) { //populates the suit
            System.out.println("Loop " + suit);
            for (int value = 0; value < 13; value++) { //populates the faces
                Card newCard = new Card(suit, value);
                deck[counter] = newCard;
                counter++;
            }
        }
    }


    public void deal(Player newPlayer) {
        int min = 0;
        int max = 52;
        int randomNum;


        do  {
            randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min); //produces a random number
        } while (usedCards.contains(randomNum));

        //if the usedCards array list has the random number in it, run the method again
        usedCards.add(randomNum); //add the random number to the Used Cards array list
        System.out.println("So far, the player has the cards at index in the deck array: " + usedCards);
        newPlayer.getHand().addCard(deck[randomNum]);





        }

//        return randomNum; //FOR TESTING: return random number i.e. index of the card in the deck array
    }

//    @Override
//    public String toString() {
//        return "Deck{" +
//                "deck=" + Arrays.toString(deck) +
//                ", usedCards=" + usedCards +
//                '}';
//    }
//}
