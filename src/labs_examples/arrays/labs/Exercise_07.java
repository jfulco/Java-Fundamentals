package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<String> item = new ArrayList<>();
        item.add("Jackie");
        item.add("Emily");
        item.add("Alex");
        item.contains(true);

        System.out.println("The names in the Array List are: ");
        for (String names : item) {
            System.out.println(names);
        }

        //ArrayList<int> item = new ArrayList<>();
        //item.add(1);
        //item.add(2);
        //item.add(3);

        //System.out.println("The values in the Array List are: ");
        //for (int vals : item){
            //System.out.println(vals);


        }
    }

