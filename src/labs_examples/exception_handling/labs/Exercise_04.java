package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 *
 *
 */


public class Exercise_04 {
    public static void main(String[] args) {
        int a[] = {1, 3, 6, 9};
        int b;
        try {
            System.out.println(a[1]);
            try {
                b = a[2] / 0;
                System.out.println(b);
            } catch (ArithmeticException divideZero) {
                System.out.println("Can't divide by zero");
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No items exist at the index");
        }
    }
}
