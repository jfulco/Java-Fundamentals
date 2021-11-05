package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("Get ready to laugh...");
        joke();
        System.out.println("2 times 7 is " + multiply(2, 7));
        System.out.println("18 divided by 9 is " + divide(18, 9));
        System.out.println("It's been " + years(2021) + " seconds since the first day of the AD calendar structure.");
        String word = "Apple";
        System.out.println("The lenght of the VarArgs array is: " + varArgsMethod(12, 13, 14, 15, 16, 12));
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {

        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke() {
        System.out.println("Q: What is the ratio of a pumpkin’s circumference to its diameter?");
        System.out.println("A: Pumpkin Pi!");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static double years(double years) {
        return years * 31536000;

    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varArgsMethod(int... a) {
        int length = a.length;
        return length;
    }
}


