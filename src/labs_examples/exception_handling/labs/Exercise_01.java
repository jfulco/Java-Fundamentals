package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 * 1) Demonstrate a try/catch.
 */

class testClass {
    public static void main(String[] args) {
        int[] nums = {1,5,8,10};
        try {
           int x = nums[12] + nums[17];
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc.toString());
        }
        System.out.println("Program Complete");
    }
}