package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        int quotient1;
        int quotient2;
        try {
            System.out.println(quotient1 = divide(24,12));
            System.out.println(quotient2 = divide(10,0));
        } catch (ArithmeticException exc){
            System.out.println("Exception thrown to main (from divide). Can't divide by zero");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        try {
            return a/b;
        } catch (ArithmeticException exc){
            System.out.println("Exception was caught by divide method: ArithmeticException");
            throw exc;
        }
    }
}