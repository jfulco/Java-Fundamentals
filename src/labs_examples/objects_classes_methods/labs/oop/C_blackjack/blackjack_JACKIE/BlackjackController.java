package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_JACKIE;

import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        playBlackJack();


//        newDeck.populateCards();
//        System.out.println(newDeck);


//        System.out.println(newDeck.getUsedCards());


    }

    public static void playBlackJack(){
        //Objects

        Scanner newPlayerInput = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = newPlayerInput.next();
        Player newPlayer = new Player(name);
        Player computerPlayer = new Player();
        Deck newDeck = new Deck();
        newDeck.deal(newPlayer);
        newDeck.deal(newPlayer);
        System.out.println(name + " has the following cards: " + newPlayer.getHand().getCards());
        System.out.print("Do you want another card? ");
        String anotherCard = newPlayerInput.next();
        boolean wantsAnotherCard;

        if (anotherCard == "No" || anotherCard == "no"){
            wantsAnotherCard = false;
        } else if (anotherCard == "Yes" || anotherCard == "yes"){
                wantsAnotherCard = true;
            do {
                newDeck.deal(newPlayer);
                System.out.println(name + " has the following cards: " + newPlayer.getHand().getCards());
                System.out.print("Do you want another card? ");
                anotherCard = newPlayerInput.next();
            } while (wantsAnotherCard = true);
        }






        newDeck.deal(computerPlayer);
        newDeck.deal(computerPlayer);
        System.out.println("The computer player has the following cards: " + computerPlayer.getHand().getCards());











    }

}