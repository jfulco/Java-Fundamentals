package labs_examples.exception_handling.labs;

import videos_source_code.exceptions.UnderAgeException;

import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 * <p>
 * 1) Create a custom exception.
 * 2) Demonstrate a method throwing your custom exception.
 */


public class Exercise_07 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What day of the week is it?"
        +"\n0 = Sunday \n1 = Monday \n2 = Tuesday \n3 = Wednesday \n4 = Thursday \n5 = Friday \n6 = Saturday");
        int dayOfWeek = userInput.nextInt();
        System.out.println("Lets see if the room is available...");
        try {
            if (roomAvailability(dayOfWeek)) {
                System.out.println("The room is available!");
            }
        } catch (NonWorkDay invalid){
            System.out.println("Custom exception thrown. Cannot evaluate non-work day.");
        }

    }

    public static boolean roomAvailability(int dayOfWeek) throws NonWorkDay{
        //0 = Sunday, 6 = Saturday
        if (dayOfWeek > 0 && dayOfWeek < 6) {
            return true;
        } else {
            throw new NonWorkDay();
        }
    }

    private static class NonWorkDay extends Exception {
        public String toString(){
            return "Non Work Day Entered {Saturday or Sunday}";
        }
    }
}