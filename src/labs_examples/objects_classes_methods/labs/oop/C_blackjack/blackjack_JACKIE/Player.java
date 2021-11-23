package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_JACKIE;

public class Player {
    private String name;
    private Hand hand = new Hand();
    private int potValue = 0;
    private int computerBet=0;
    private int playerBet = 0;

    //constructors
    public Player(String name) {
        this.name = name;
    }

    public Player() {
    }

    //methods
    public boolean computerAI(Player computerPlayer) {
        boolean anotherCard;
        if (this.hand.getHandValue() < 16) { //If the computer's hand value is less than 16, set anotherCard to true.
            anotherCard = true;
            System.out.print("The computer wants another card. ");
        } else {
            anotherCard = false;                        //otherwise, set anotherCard to false
            System.out.print("The computer does not want a card.");
        }
        return anotherCard; //return the value of anotherCard
    }

    public boolean playerWantsCard(String anotherCard) {
        boolean wantsAnotherCard = false;
        if (anotherCard.equalsIgnoreCase("yes")) {
            wantsAnotherCard = true;
        } else if (anotherCard.equalsIgnoreCase("no")) {
            wantsAnotherCard = false;
        }
        return wantsAnotherCard;
    }

    public int computerBets(Player computerPlayer) {
        int min = 0;
        int max = 500;
        computerBet = (int) Math.floor(Math.random() * (max - min + 1) + min);
        potValue += computerBet;
        return potValue;
    }

    public int addPlayerBetToPot(int playerBet) {
        potValue += playerBet;
        return potValue;
    }

    public void getPotValue(){
        this.computerBet = computerBet;
        this.playerBet = playerBet;
        potValue = computerBet + playerBet;
        System.out.println("Currently, the pot value is: $" + potValue);
    }


    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }




}
