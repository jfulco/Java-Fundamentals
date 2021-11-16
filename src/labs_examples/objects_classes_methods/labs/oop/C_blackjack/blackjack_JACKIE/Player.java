package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_JACKIE;

public class Player {
    private String name;
    private Hand hand;
    private int potValue;

    //constructors
    public Player(String name) {
        this.name = name;
    }

    public Player() {
    }

    //methods
    public boolean computerAI() {
        boolean anotherCard;

        if (this.hand.getHandValue() < 16) { //If the computer's hand value is less than 16, set anotherCard to true.
            anotherCard = true;
        } else {
            anotherCard = false;                        //otherwise, set anotherCard to false
        }
        return anotherCard; //return the value of anotherCard
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }


}
