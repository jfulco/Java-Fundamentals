package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */





public class Exercise_06 {
    public static void main(String[] args) {
        int quotient1;
        int quotient2;
        try {
            System.out.println(quotient1 = divide(24, 12));
            System.out.println(quotient2 = divide(10, 0));
        } catch (ArithmeticException exc) {
            System.out.println("Divide threw an exception.");
        }
    }
    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }
}