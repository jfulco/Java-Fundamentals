package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.PolyExamples;

public class SomeOtherClass extends SomeClass {

    //Overloading
    public SomeOtherClass() {
        System.out.println("You need to give parameters for SomeOtherClass to take in");
    }

    public SomeOtherClass(double a, double b, String name) {
        super(a, b, name);
    }

    //Example of overriding the SomeClass multiply method
    @Override
    public double multiply(double a, double b) {
        return (a*b) * 2;
    }

}
