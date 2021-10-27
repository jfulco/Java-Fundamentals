package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[][] multiDArray = new int[3][2];
        int count = 0;
        for (int i = 0; i < multiDArray.length; i++){
            for (int j = 0; j <multiDArray[i].length; j++){
                multiDArray[i][j] = count;
                count++;
            }
        }
        System.out.println();
        for(int[] element : multiDArray){
            for(int val : element){
                System.out.print(val);
            }
            System.out.println();
        }

    }

}
