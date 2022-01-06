package labs_examples.lambdas.labs;

import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes
 *      no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it.
 *      Also demonstrate creating
 *      *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */
//1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
interface FunctionalInterface {
    void abstractFunction();
}

//3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a value of the same type as the parameter
interface FunctionalInterfaceWithParameter{
    int doubleNum(int a);
}

//5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a value
interface FunctionalInterfaceBiParameters{
    int add(int a, int b);
}

// 2) Implement the previous functional interface with a lambda expression and use it.
class Exercise_01 {
    public static void main(String[] args) {
        FunctionalInterface lambdaTest = () -> System.out.println("This invokes the Functional Interface abstractFunction!");
        lambdaTest.abstractFunction();

//Also demonstrate creating an anonymous inner class from this interface.
        FunctionalInterface obj = new FunctionalInterface() {
            @Override
            public void abstractFunction() {
                System.out.println("This invokes the Functional Interface in an anon inner class!");
            }
        };
        obj.abstractFunction();

// 4) Implement the previous functional interface with a lambda expression and use it.
        FunctionalInterfaceWithParameter testWithParameter = a -> a * 2;
        System.out.println(testWithParameter.doubleNum(3));

//    Also demonstrate creating an anonymous inner class from this interface.
        FunctionalInterfaceWithParameter obj2 = new FunctionalInterfaceWithParameter() {
            @Override
            public int doubleNum(int a) {
                return a * 2;
            }
        };
        int doubleNum = obj2.doubleNum(8);
        System.out.println(doubleNum);

// 6) Implement the previous functional interface with a lambda expression and use it.
        FunctionalInterfaceBiParameters biParameters = (a, b) -> a + b;
        System.out.println(biParameters.add(5, 6));

//Also demonstrate creating an anonymous inner class from this interface.
        FunctionalInterfaceBiParameters biParameters1 = new FunctionalInterfaceBiParameters() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(biParameters1.add(4,10));

// 7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(2, 13));
        Predicate<String> equalsThis = str -> str == "Yes";
        System.out.println(equalsThis.test("No"));
    }
}