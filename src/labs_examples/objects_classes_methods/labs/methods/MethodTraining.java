package labs_examples.objects_classes_methods.labs.methods;
//Imports Person class from a different package within labs_examples
import labs_examples.objects_classes_methods.classes.Person;
import java.util.ArrayList;
import java.lang.Math;

public class MethodTraining {
    public static void main(String[] args) {

// 2. Pass by value
        System.out.println("//2. Pass by Value & Pass by Reference");

        int v = 1;
        int w = 2;
        int x = 19;
        double y = 18;
        double z = 17.9;
        double num = 13;
        System.out.println(v + " + " + w + " = " + addition(v, w));
        System.out.println(v + " + " + w + " + " + x + " = " + addition(v, w, x));
        System.out.println(y + " + " + z + " = " + addition(y, z));

//2. Pass by reference
        Person person = new Person(22, 120, "Maddie");
        System.out.println(person.toString());
        System.out.println("_____________________________________________");

//3.  Evaluate the largest of 4 numbers
        System.out.println("//3. Evaluate the largest of 4 numbers");
        System.out.println("The largest of 4 numbers is: " + largest(12, 35, 62, 18));
        System.out.println("_____________________________________________");


//4. Finding all consonant`s
        System.out.println("//4. Finding all consonant`s");
        System.out.println("The number of consonants is " + consonants("boyband"));
        System.out.println("_____________________________________________");


//5.  Is  the number prime?
        System.out.println("//5.  Is  the number prime?");
        if (prime(num) == true) {
            System.out.println(num + " is prime!");
        } else {
            System.out.println(num + " is not prime!");
        }
        System.out.println("_____________________________________________");

//6. Return small array with the highest and lowest numbers in a given numeric array, passed in as an argument
        System.out.println("//6. Return small array with the highest and lowest numbers in a given numeric array, passed in as an argument");
        int[] numArray = {1, 2, 3};
        //this stores the return
        int[] result = printArray(numArray);
        System.out.println("The array is: " + numArray[0] + ", " + numArray[1] + ", " + numArray[2]);
        System.out.println("Lowest:" + result[0]);
        System.out.println("Highest: " + result[1]);
        System.out.println("_____________________________________________");


//7.  3 arguments, return ArrayList
        System.out.println("//7.  3 arguments, return ArrayList");
        System.out.println("The ArrayList is " + intArrayList(15, 2, 5));
        System.out.println("_____________________________________________");


//8. Reverse an array in place using only one extra temp variable
//        System.out.println("//8. Reverse an array in place using only one extra temp variable");
//        System.out.println("_____________________________________________");
//     reverseArray(int[] = {2, 3, 4, 6})
//        System.out.println(reverseArray();
//    }

    }
    //METHODS CREATED BY JACKIE:


    //1. Overloading examples
    static int addition(int a, int b) {
        return a + b;
    }

    static int addition(int a, int b, int c) {
        return a + b + c;
    }

    static double addition(double a, double b) {
        return a + b;
    }


// 2. Pass by reference


    // 3. Evaluate the largest of 4 numbers
    public static double largest(int aa, int bb, int cc, int dd) {
        if (aa > bb && aa > cc && aa > dd)
            return aa;
        if (bb > cc && bb > dd)
            return bb;
        if (cc > dd) {
            return cc;
        } else
            return dd;
    }


    //4. Finding all consonants
    public static int consonants(String word) {

        int i = 0;
        int count = 0;
        String vowels = "aeiou";

        while (i < word.length()) {
            if (vowels.indexOf(word.charAt(i)) == -1) {
                //adds 1 consonent to the count
                count++;
            }
            i++;
        }
        return count;
    }


//5.  Is  the number prime?

    public static boolean prime(double num) {
        boolean isTrue = true;
        double sqrt = Math.sqrt(num);
        for (int i = 2; i < sqrt; i++) {
            if (num % i == 0) {
                isTrue = false;
            }
        }
        return isTrue;

    }

    //6. Return small array with highest and lowest numbers in given numeric array, passed in as an argument
    static int[] printArray(int[] numArray) {

        int max = numArray[0];
        int min = numArray[0];
        //Finding the maximum value
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
            }

        }
        //Finding the minimum value
        for (int j = 0; j < numArray.length; j++) {
            if (numArray[j] < min) {
                min = numArray[j];
            }
        }
        int[] minMax = {min, max};
        return minMax;
    }


    //7.  3 arguments, return ArrayList
    static ArrayList<Integer> intArrayList(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> variable = new ArrayList<Integer>();
        for (int i = 0; i < maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                variable.add(i);
            }
        }
        return variable;
    }


//8. Reverse an array in place using only one extra temp variable

    static int[] reverseArray(int[] nums) {
        int temp;
        int end = nums.length - 1;

        // Question: in the for loop below, why do we divide "nums.length" by 2?
        for (int i = 0; i < nums.length / 2; i++, end--) {
            temp = nums[i];
            nums[i] = nums[end];
            nums[end] = temp;
        }
        return nums;
    }
}










