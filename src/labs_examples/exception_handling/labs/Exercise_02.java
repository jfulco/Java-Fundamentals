package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class someClass {
    public static void main(String[] args) {
        float[] nums = {17, 18, 93, 0};
        try {
            System.out.println(divide(nums[1], nums[2]));
            System.out.println(divide(nums[1], nums[10]));
            System.out.println(divide(nums[5], nums[3]));
        } catch (ArithmeticException divideZero){
            System.out.println("Can't divide by zero");
        } catch (ArrayIndexOutOfBoundsException outOfBounds){
            System.out.println("One of the values is not in the int array. Sorry!");
        }
    }

    public static float divide(float a, float b) throws ArithmeticException {
        return a / b;
    }
}


