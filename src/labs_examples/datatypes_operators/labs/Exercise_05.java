package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;

        if (a & b){
            System.out.println("a and be are true");
        }

        if (a && b){
            System.out.println("b is true if a is also true");
        }
        if (a || b){
            System.out.println("If a is true, b may also be true");
        }
        if (a | b){
            System.out.println("a or b is true");
        }
        if (a ^ b){
            System.out.println("If a is true, b is false; if b is true, a is false");
        }


    }

}

