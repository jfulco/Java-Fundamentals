package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 0-7: ");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("The 1st day of the week is Sunday!");
        } else if (num == 2) {
            System.out.println("The 2nd day of the week is Monday!");
        } else if (num == 3) {
            System.out.println("The 3rd day of the week is Tuesday!");
        } else if (num == 4) {
            System.out.println("The 4th day of the week is Wednesday!");
        } else if (num == 5) {
            System.out.println("The 5th day of the week is Thursday!");
        } else if (num == 6) {
            System.out.println("The 6th day of the week is Friday!");
        } else if (num == 7) {
            System.out.println("The 7th day of the week is Saturday!");
        } else {
            System.out.println("Way to NOT follow directions...");
        }

        //Challenge! Nested-if statement
        if (num == 1 | num == 7) {
            if (num == 1) {
                System.out.println("Boo, we gotta work tomorrow. :(");
            } else {
                System.out.println("Yay! Party time! :)");
            }
        }
            else if (num <=6 || num >=2) {
                System.out.println("The week is taking forever...");
            }


    }
}