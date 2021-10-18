package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 * <p>
 * Please follow the instructions in the comments below
 */
public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        System.out.println("The value of the first string is " + str);
        // please declare an int variable below, and set it to the value of the length of "str"
        int intVal = str.length();
        System.out.println("The length of string 1 is " + intVal);


        String str2 = "hello";
        System.out.println("The value of the second string is " + str2);
        // please initialize a boolean variable and test whether str is equal to str2
        boolean equalStrings = str.equalsIgnoreCase(str2);
        System.out.println("Do str1 & str2 match? " + equalStrings);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = (str + str2);
        System.out.println("The value of the third string is " + str3);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String subStr = str.substring(2, 5);
        System.out.println("The substring is: " + subStr);
        char letterAt = str2.charAt(1);
        System.out.println("The first letter of string 2 is " + letterAt);
        System.out.println(str2.replace('h', 'j'));
        System.out.println(str.contains("Te"));
    }


}