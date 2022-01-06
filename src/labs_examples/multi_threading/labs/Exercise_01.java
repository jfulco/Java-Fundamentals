package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the
 *      Runnable you just created
 *
 */


class Exercise_01{
    public static void main(String[] args) {
        System.out.println("Main thread starting...");
        MyFirstRunnable threadTest = new MyFirstRunnable("MyFirstRunnable");
        MyFirstRunnable threadTest2 = new MyFirstRunnable("MySecondRunnable");
    }
}

class MyFirstRunnable implements Runnable{
    Thread thread;

    public MyFirstRunnable(String name) {
        thread = new Thread(this, name);
        thread.start(); //starting it in the constructor
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " started!");
        try {
            for (int i = 0; i < 10; i++){
                Thread.sleep(1000);
                System.out.println("In " + thread.getName() + ", count is " + i);
            }
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
        System.out.println(thread.getName() + " is all done!");

    }
}


