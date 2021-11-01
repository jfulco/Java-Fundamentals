package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 *
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int[] num = new int[5];
        //populates the values for array by a count I give it;
        num[0] = 63;
        num[1] = 3;
        num[2] = 12;
        num[3] = 45;
        num[4] = 5;

        System.out.println("In reverse order, every other element in the 5 item array is: ");

        for (int i = num.length - 1; i >= 0; i -= 2) {
                System.out.println(num[i] + ", which is at index " + i + ".");
        }
    }

}
