package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner inputOne = new Scanner(System.in);


        System.out.print("Type 10 numbers between 0 to 100, hitting 'Enter' after each number: ");
        System.out.println();

        int [] vals = new int[10];
        for (int i = 0; i < vals.length; i++){
            vals[i] = inputOne.nextInt();
        }
      //  vals[0] = inputOne.nextInt();
        //vals[1] = inputOne.nextInt();
//        vals[2] = inputOne.nextInt();
//        vals[3] = inputOne.nextInt();
//        vals[4] = inputOne.nextInt();
//        vals[5] = inputOne.nextInt();
//        vals[6] = inputOne.nextInt();
//        vals[7] = inputOne.nextInt();
//        vals[8] = inputOne.nextInt();
//        vals[9] = inputOne.nextInt();

        System.out.println("Now lets find the sum of ALL the values you entered.");
        int sum = 0;
        for (int i = 0; i < vals.length; i++){
            System.out.println("The number you entered at index " + i + " is " + vals[i] + ".");
            sum += vals[i];
        }
        int average = sum/vals.length;
        System.out.println("The sum of all your numbers is " + sum + ".");
        System.out.println("The average of all your numbers is " + average + ".");


    }

}