package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.PolyExamples;

public class SomeClass implements Interface {

    private double a;
    private double b;
    private String name;

    //Overloading methods
    public SomeClass() {
        System.out.println("You need to put in parameters for SomeClass to take in.");
    }

    public SomeClass(double a, double b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
        System.out.println(toString());
    }

    public double multiply(double a, double b){
        this.a = a;
        this.b = b;
        return a*b;
    }

    @Override
    public String toString() {
        return "{" +
                "a=" + a +
                ", b=" + b +
                ", name='" + name + '\'' +
                '}';
    }


    //Interface methods

    @Override
    public void begin() {
        System.out.println("The code has begun!");
    }

    @Override
    public void stop() {
        System.out.println("The code has ended!");
    }

    //getter & setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
