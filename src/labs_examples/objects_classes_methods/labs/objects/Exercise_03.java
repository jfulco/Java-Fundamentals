package labs_examples.objects_classes_methods.labs.objects;

import java.util.ArrayList;

public class Exercise_03 {
}


class PersonController {
    public static void main(String[] args) {
        Person person = new Person("Italian", true, "Jackie");
        Food recipe = new Food();
        System.out.println("Is " + person.name + " hungry? " + person.isHungry);
        System.out.println(person.name + " wants to eat " + person.foodType + " food.");
        System.out.println("To make " + person.foodType + " food, " + person.name + " will need ");
        recipe.Food("Noodles", "Sauce", "Meatballs", "Bread", "Parm Cheese");

    }
}


    class Person {
        String foodType;
        boolean isHungry;
        String name;

        public Person(String foodType, boolean isHungry, String name) {
            this.foodType = foodType;
            this.isHungry = isHungry;
            this.name = name;
        }
    }

    class Food{


        public void Food(String...item){
        for (String ingredients: item) {
            System.out.println(ingredients);
        }
    }

    }


