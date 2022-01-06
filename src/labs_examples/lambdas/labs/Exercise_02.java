package labs_examples.lambdas.labs;

import java.util.Locale;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Exercise_02 {
    public static void main(String[] args) {
//1. Accepts two types of data but does not return a type back.
        BiConsumer integerInfo = (a, b) -> System.out.println("a = " + a + "\nb = " + b);
        integerInfo.accept(12, 12);

//2. Comparing one thing to another, find min and max
        BinaryOperator getOldest
                = BinaryOperator.maxBy((Person person1, Person person2) -> person1.age - person2.age);
        Person jackie = new Person("Jackie", 30);
        Person emily = new Person("Emily", 36);
        Person oldestPerson = (Person) getOldest.apply(jackie, emily);
        System.out.println(oldestPerson + " is older!");

//3. Returns boolean value as either true or false, when set in the lambda expression.
// Why would I use this?
        BooleanSupplier isTrue = () -> false;
        System.out.println(isTrue.getAsBoolean());

//4. Takes in a double and returns a generic type (example is an int, so it has to be cast from the double)
        DoubleFunction<Integer> doubleQuotient = (a) -> (int) a / 10;
        System.out.println(doubleQuotient.apply(56.9));

//5. Returns the value of the argument. In this case, the returnDouble object is equal to the identity of the double,
//and the double is applied by the interface.
        DoubleUnaryOperator returnDouble = DoubleUnaryOperator.identity();
        System.out.println(returnDouble.applyAsDouble(12.36));

//6. Compares two parameters and returns a true or false when conditions are met (or not)
        BiPredicate<String, Integer> verifyNameLength = (x, y) -> {
            return x.length() == y;
        };

        boolean test1 = verifyNameLength.test("Jackie", 6);
        boolean test2 = verifyNameLength.test("Emily", 7);
        System.out.println("Test 1: " + test1 + "\nTest 2: " + test2);
//7. Accepts data of any type and does not return a type back.
        Consumer<String> info = x -> System.out.println(x);
        info.accept("I am so tired right now.");

//8. Do something to a type, returning a different type if you wish
        Function<String, String> upperCase = (a) -> {
            return a.toUpperCase();
        };
        System.out.println(upperCase.apply("I want to go to bed!!!!!!"));

//9. Supply a random double
        DoubleSupplier randomNum = () -> Math.random();
        System.out.println(randomNum.getAsDouble());

//10.
        Predicate<String> containsLetterA = (x) -> {
            x = upperCase.apply(x);


            if (x.equalsIgnoreCase().contains('a')) {
            if (x.equalsIgnoreCase().contains('a')) {
                    result = false;
                    return result;
                }
                return result;
            }
        };

        System.out.println(containsLetterA.test("Emily"));
        System.out.println(containsLetterA.test("Jackie"));


    }
}

        class Person {
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return name + ", Age " + age;
            }
        }

