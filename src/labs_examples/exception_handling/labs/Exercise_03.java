package labs_examples.exception_handling.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class someClass2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Let's test divisibility of numbers.");
        System.out.println("Enter an integer 0 to 50:");
        int a = userInput.nextInt();
        System.out.println("Enter an integer 0 to 5");
        int b = userInput.nextInt();
        System.out.println("Let's see if " + a + " and " + b + " can be evenly divided...");
        try {
                divisibility(a, b);
                if (divisibility(a, b) == 0) {
                    System.out.println("Great job! " + a + " and " + b + " can be evenly divided!");
                } else {
                    System.out.println("Whoops! " + a + " and " + b + " can't be evenly divided. Keep practicing!");
                }
        } catch (ArithmeticException divideZero){
            System.out.println("Error: Can't divide by zero");
        } finally {
            System.out.println("Program Complete");
        }
    }

    public static int divisibility(int a, int b) throws ArithmeticException {
       return a%b;
    }

}