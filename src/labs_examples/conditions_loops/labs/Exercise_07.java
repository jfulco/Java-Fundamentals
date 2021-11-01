package labs_examples.conditions_loops.labs;

import java.util.Scanner;
public class Exercise_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = scanner.next();
        int i = 0;
        String vowels = "aeiou";

        while (i < word.length() ){
            if (vowels.indexOf(word.charAt(i))  > -1){
                System.out.println("The word is " + word);
                System.out.println("The first vowel is " + word.charAt(i));
                break;
            }
            i++;

        }
    }
}