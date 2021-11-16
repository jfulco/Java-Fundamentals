package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_JACKIE;

import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
//        newDeck.populateCards();
//        System.out.println(newDeck);


//        System.out.println(newDeck.getUsedCards());


    }

    public static void playBlackJack(){
        //Objects
        Scanner newPlayerInput = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = newPlayerInput.next();
        Player newPlayer = new Player(name);
        Player computerPlayer = new Player();
        Deck newDeck = new Deck();
        newDeck.deal(newPlayer);






    }

}