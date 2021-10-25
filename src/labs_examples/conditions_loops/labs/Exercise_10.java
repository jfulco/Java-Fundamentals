package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        System.out.println("Let's count to 40!");
        for (int i = 0; i <= 40; i++){
            System.out.println("The number is " + i);
            if (i == 20){
                System.out.println("**Woohoo, we're half way there!**");
                continue;
            }
        }
        System.out.println("All done!");
    }
}
