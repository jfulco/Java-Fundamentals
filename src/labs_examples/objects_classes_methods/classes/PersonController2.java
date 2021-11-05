package labs_examples.objects_classes_methods.classes;

public class PersonController2 {
    public static void main(String[] args) {
        Person somePerson = new Person(34, 183, "Matt");
        Person someOtherPerson = new Person(30, 177, "Jackie");

        System.out.println(somePerson.name + " is " + somePerson.age + " years old and " + somePerson.height + " centimeters tall." );
        System.out.println(someOtherPerson.name + " is " + someOtherPerson.age + " years old and " + someOtherPerson.height + " centimeters tall." );


    }
}
