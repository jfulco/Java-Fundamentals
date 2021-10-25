package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("I have a 10 slot array already populated.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number 1 - 10 to reveal where it's located (what index) in the array: ");
        int num = input.nextInt();

        if (num == array[0]) {
            System.out.println("Your number is at index 0 in the array.");
        } else if (num == array[1]) {
            System.out.println("Your number is at index 1 in the array.");
        } else if (num == array[2]) {
            System.out.println("Your number is at index 2 in the array.");
        } else if (num == array[3]) {
            System.out.println("Your number is at index 3 in the array.");
        } else if (num == array[4]) {
            System.out.println("Your number is at index 4 in the array.");
        } else if (num == array[5]) {
            System.out.println("Your number is at index 5 in the array.");
        } else if (num == array[6]) {
            System.out.println("Your number is at index 6 in the array.");
        } else if (num == array[7]) {
            System.out.println("Your number is at index 7 in the array.");
        } else if (num == array[8]) {
            System.out.println("Your number is at index 8 in the array.");
        } else if (num == array[9]) {
            System.out.println("Your number is at index 9 in the array.");
       }

    }
}