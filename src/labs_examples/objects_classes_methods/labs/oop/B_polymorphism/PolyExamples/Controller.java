package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.PolyExamples;

public class Controller {
    public static void main(String[] args) {
        SomeClass input = new SomeClass(6,5,"Jackie");
        SomeOtherClass input2 = new SomeOtherClass(3,4,"Nikki");
        input.begin();
        System.out.println(input.getName() + " entered a = " + input.getA() + " & b = " + input.getB() + ". a & b multipled is: " + input.multiply(input.getA(), input.getB()));
        System.out.println(input2.getName() + " entered a = " + input2.getA() + " & b = " + input2.getB() + ". a & b multipled by 2 is: " + input2.multiply(input2.getA(), input2.getB()));
        input.stop();
    }
}
