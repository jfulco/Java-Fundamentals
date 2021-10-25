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
        Scanner inputTwo = new Scanner(System.in);
        Scanner inputThree = new Scanner(System.in);
        Scanner inputFour = new Scanner(System.in);
        Scanner inputFive = new Scanner(System.in);
        Scanner inputSix = new Scanner(System.in);
        Scanner inputSeven = new Scanner(System.in);
        Scanner inputEight = new Scanner(System.in);
        Scanner inputNine = new Scanner(System.in);
        Scanner inputTen = new Scanner(System.in);

        System.out.print("Type 10 numbers between 0 to 100, hitting 'Enter' after each number: ");
        System.out.println();

        int [] vals = new int[10];
        vals[0] = inputOne.nextInt();
        vals[1] = inputTwo.nextInt();
        vals[2] = inputThree.nextInt();
        vals[3] = inputFour.nextInt();
        vals[4] = inputFive.nextInt();
        vals[5] = inputSix.nextInt();
        vals[6] = inputSeven.nextInt();
        vals[7] = inputEight.nextInt();
        vals[8] = inputNine.nextInt();
        vals[9] = inputTen.nextInt();

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