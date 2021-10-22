package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1-12 to pick your favorite month of the year: ");
        int month = scanner.nextInt();
            switch (month) {
                case 1:
                    System.out.println("Your favorite month is January.");
                    break;
                case 2:
                    System.out.println("Your favorite month is February,");
                    break;
                case 3:
                    System.out.println("Your favorite month is March.");
                    break;
                case 4:
                    System.out.println("Your favorite month is April.");
                    break;
                case 5:
                    System.out.println("Your favorite month is May.");
                    break;
                case 6:
                    System.out.println("Your favorite month is June");
                    break;
                case 7:
                    System.out.println("Your favorite month is July");
                    break;
                case 8:
                    System.out.println("Your favorite month is August");
                    break;
                case 9:
                    System.out.println("Your favorite month is September");
                    break;
                case 10:
                    System.out.println("Your favorite month is October");
                    break;
                case 11:
                    System.out.println("Your favorite month is November");
                    break;
                case 12:
                    System.out.println("Your favorite month is December");
                    break;
                default:
                    System.out.println("I guess you don't have a favorite month...? Bummer.");
            }


    }
}
