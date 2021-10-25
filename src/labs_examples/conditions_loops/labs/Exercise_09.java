package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        System.out.println("From 0 to 200, let's count by 2's!");
        for (int i = 0; i < 200; i +=2){
            System.out.println("the number is " + i);
             while (i >= 100 & i <= 150) {
                 i += 5;
                 System.out.print("When the iteration is between 100 and 150, let's count by 7, so ");
                 break;
             }
            }
        System.out.println("All done!");
        }
    }

