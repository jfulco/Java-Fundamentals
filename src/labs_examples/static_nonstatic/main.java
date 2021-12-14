package labs_examples.static_nonstatic;

class Main {
    public static void main(String[] args) {
        // create at least 3 distinct frogs below
        Frog stan = new Frog ("Stan", "California");
        Frog steve = new Frog ("Steve", "Florida");
        Frog sean = new Frog ("Sean", "Maryland");

        // once all are created, call the toString() on each
        System.out.println(stan.toString());
        System.out.println(steve.toString());
        System.out.println(sean.toString());



        // what printed for numFrogs? why?

    }
}
class Frog {
    String name;
    String habitat;
    static int numFrogs;

    public Frog(String name, String habitat){
        this.name = name;
        this.habitat = habitat;
        numFrogs++;
    }

    @Override
    public String toString() {
        return "Frog{" +
                "name='" + name + '\'' +
                ", habitat='" + habitat + '\'' +
                ", numFrogs= " + numFrogs + '\'' +
                '}';
    }
}