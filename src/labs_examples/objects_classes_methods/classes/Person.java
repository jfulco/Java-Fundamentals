package labs_examples.objects_classes_methods.classes;
//Plain old Java object (POJO) - represents data, doesn't actually operate on the data.

public class Person {
    //instance variable
    int age;
    double height;
    String name;

    //constructors
    //default - if there are no parameters, it will default to the constructor below:
    public Person(){

    }

    //parameterized constructor, takes in specific parameters of the object that calls it
    public Person(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }



    //methods

    @Override
    public String toString() {
        return "Person{" +
                "age =" + age +
                ", height =" + height +
                ", name ='" + name + '\'' +
                '}';
    }
}
