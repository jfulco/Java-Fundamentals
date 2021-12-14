package labs_examples.static_nonstatic.labs;

public class Exercise_01 {
    public static void main(String[] args) {
        Exercise_01 newObjSame = new Exercise_01();
        anotherClass newObj = new anotherClass();
        staticMethodSame();                     //1) A static method calling another static method in the same class
        newObjSame.nonStaticMethodSame();       //2) A static method calling a non-static method in the same class
        anotherClass.staticMethod();            //3) A static method calling a static method in another class
        newObj.nonStaticMethod();               //4) A static method calling a non-static method in another class
    }

    public static void staticMethodSame(){
        System.out.println("Printing out static method in same class (Exercise_01)");

    }

    public void nonStaticMethodSame(){
        System.out.println("Printing out non-static method in same class (Exercise_01)");

    }

    public int divide(int a, int b){
        staticMethodSame();                     //7) A non-static method calling a static method in the same class
        return a/b;
    }
}

class anotherClass {
    public static void staticMethod(){
        System.out.println("Printing out static method in another class (anotherClass)");
    }

    public void nonStaticMethod(){
        Exercise_01 obj = new Exercise_01();
        System.out.println("Printing out non-static method in another class (anotherClass)");
        multiply(2,3,4);                //5) A non-static method calling a non-static method in the same class
        obj.divide(6,3);                   //6) A non-static method calling a non-static method in another class
        Exercise_01.staticMethodSame();         //8) A non-static method calling a static method in another class
    }

    public int multiply(int a, int b, int c){
        return a*b*c;
    }
}
