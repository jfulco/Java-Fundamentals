package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjack_JACKIE;

import java.util.Locale;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        Scanner newPlayerInput = new Scanner(System.in);
        System.out.println("Let's play Black Jack! This game is a little different than traditional Black Jack." +
                "\nYou and the computer will get a chance to draw a card one at time. " +
                "\nEach round, you'll bet based on your current hand. Then, whoever wins the entire game wins the money! " +
                "\nAt the end of the game, you'll have a chance to play again!");
        System.out.println("Are you ready to play? Enter true or false!");
        boolean anotherRound = newPlayerInput.nextBoolean();
        int totalGames = 0;
        int winner;
        int totalWinsPlayer = 0;
        int totalWinsComputer = 0;
        do{
            winner = playBlackJack();
            totalGames++;
            if (winner == 0){
                totalWinsPlayer++;
            } else if (winner == 1){
                totalWinsComputer++;
            }
            System.out.println("Play again? Enter true or false!");
            anotherRound = newPlayerInput.nextBoolean();
        } while (anotherRound);
        System.out.println("You played a total of " + totalGames + " games!");
        System.out.println("The computer won " + totalWinsComputer + " games.");
        System.out.println("You won " + totalWinsPlayer + " games.");
        System.out.println("Application Over");
    }

    public static int playBlackJack() {
        //Objects

        Scanner newPlayerInput = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = newPlayerInput.next();
        Player newPlayer = new Player(name);
        Player computerPlayer = new Player();
        Deck newDeck = new Deck();
        newDeck.deal(newPlayer);
        newDeck.deal(newPlayer);
        newDeck.deal(computerPlayer);
        newDeck.deal(computerPlayer);

        System.out.println(name + " has the following cards: " + newPlayer.getHand().getCards() + ". The value of " + name + "'s hand is " + newPlayer.getHand().getHandValue() + ".");
        System.out.println("The computer has the following cards: " + computerPlayer.getHand().getCards() + ". The value of the computer's hand is " + computerPlayer.getHand().getHandValue() + ".");


        System.out.print(name + ", how much do you want to bet on the first round? $");
        int playerBet = newPlayerInput.nextInt();
        int computerBet;
        if (computerPlayer.computerMatchBet(computerPlayer, playerBet)){
            computerBet = playerBet;
        } else {
            computerBet = 0;
        }
        System.out.println("The current pot value is: " + newPlayer.getPotValue(computerBet, playerBet));
        System.out.print("Do you want another card, " + name + "? ");
        String anotherCard = newPlayerInput.next();


        while (newPlayer.playerWantsCard(anotherCard)) {
            System.out.println("_____________________________________________________");
            newDeck.deal(newPlayer);
            System.out.println(name + " was dealt another card. " + name + " has the following cards: " + newPlayer.getHand().getCards() + ". The value of " + name + "'s hand is " + newPlayer.getHand().getHandValue() + ".");
            if (computerPlayer.computerAI(computerPlayer)) {
                newDeck.deal(computerPlayer);
                System.out.println("The computer was dealt another card. The computer has the following cards: " + computerPlayer.getHand().getCards() + ". The value of the computer's hand is " + computerPlayer.getHand().getHandValue() + ".");
            } else {
                System.out.println("The computer has the following cards: " + computerPlayer.getHand().getCards() + ". The value of the computer's hand is " + computerPlayer.getHand().getHandValue());
            }
            if (newPlayer.getHand().isHandOver21()) {
                newPlayer.playerWantsCard("No");
                System.out.println("Bust! You're over 21! No more cards for you.");
                break;
            } else if (!newPlayer.getHand().isHandOver21()) {
                System.out.print(name + ", how much more do you want to bet? $ ");
                playerBet += newPlayerInput.nextInt();
                if (computerPlayer.computerMatchBet(computerPlayer, playerBet)){
                    computerBet = playerBet;
                } else {
                    computerBet = 0;
                }
                System.out.println("The current pot value is: " + newPlayer.getPotValue(computerBet, playerBet));
                System.out.print("Do you want another card, " + name + "? ");
                anotherCard = newPlayerInput.next();
            }
        }


        //conditions for winning
        int winner = 0; // 0 = player, 1 = computer, 2 = no one
        if (newPlayer.getHand().isHandOver21() == false & computerPlayer.getHand().isHandOver21() == false) {
            if (newPlayer.getHand().getHandValue() > computerPlayer.getHand().getHandValue()) {
                System.out.println("You won! :)");
                winner = 0;
                System.out.println("You won: $" + newPlayer.getPotValue());
            } else if (newPlayer.getHand().getHandValue() < computerPlayer.getHand().getHandValue()) {
                System.out.println("The computer won. :(");
                winner = 1;
                System.out.println("The computer won: $" + newPlayer.getPotValue());
            } else {
                System.out.println("You and the computer tied!");
                winner = 2;
                System.out.println("The computer and you both won: $" + newPlayer.getPotValue()/2);
            }
        } else if (newPlayer.getHand().isHandOver21() == true & computerPlayer.getHand().isHandOver21() == false) {
            System.out.println("The computer won. :(");
            winner = 1;
            System.out.println("The computer won: $" + newPlayer.getPotValue());
        } else if (newPlayer.getHand().isHandOver21() == false & computerPlayer.getHand().isHandOver21() == true) {
            System.out.println("You won! :)");
            winner = 0;
            System.out.println("You won: $" + newPlayer.getPotValue());
        }


        return winner;
    }



}



