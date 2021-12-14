package labs_examples.objects_classes_methods.labs.oop.D_my_oop.oop_JACKIE;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        Services.generateToolObjects();
        Scanner userInput = new Scanner(System.in);
        //explain what the application is in more detail.
        System.out.println("The purpose of this application is to help you identify an academic tool that is right for you!");
        //Question that leads to switch statement - what does the user want to do?
        System.out.println("What would you like to do today?\n\t0 = I want to find a tool\n\t1 = I want to browse tools by category\n\t" + //loop through this section and have something to either start or stop
                "2 = I want to browse all tools\n\t3 = I want to add a new tool to the master tool list");
        System.out.print("Using the key above, enter a number 0 - 3: ");
        int userDecision = userInput.nextInt();
        Services.userDecision(userDecision);
    }
}

