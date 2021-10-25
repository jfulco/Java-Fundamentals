package labs_examples.conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanOne = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");
        double lowerBound = scanOne.nextInt();

        Scanner scanTwo = new Scanner(System.in);
        System.out.println("Enter another number between 1 and 100: ");
        double upperBound = scanTwo.nextInt();

        double sum = 0;
        double totalNum = upperBound - lowerBound + 1;
        System.out.println("The total number of values between the lowerBound and upperBound is " + totalNum);

        for (double i = lowerBound; i <= upperBound; i++) {
            sum += i;
        }
        System.out.println("The sum of all values between " + lowerBound + " and " + upperBound + " is " + sum);
        double average = sum / totalNum;
        System.out.println("The average of all values between " + lowerBound + " and " + upperBound + " is " + average);
    }
}


