package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {
    public static void main(String[] args) {
        int i = 1003;
        System.out.println("Count down by 3...");
        do {
            i -= 3;
            System.out.println("The count is: " + i);
        } while (i > 1 & i <= 1000);
        System.out.println("All done!");
    }
}
