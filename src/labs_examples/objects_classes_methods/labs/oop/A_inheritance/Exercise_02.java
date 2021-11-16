package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 *
 * Object 'a' invokes the 'A' class, which sets int i = 10. Because B extends A,
 * the object can be created
 * calling the B class.
 * */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();




        A a2 = new A();
        B b = new B();

        System.out.println(a.i);
        System.out.println(a2.i);
        System.out.println(b.i);
    }
}
