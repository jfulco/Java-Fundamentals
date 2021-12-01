package labs_examples.objects_classes_methods.labs.oop.D_my_oop.oop_JACKIE;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Tool tool = new Tool();
        PaidTool Yellowdig = new PaidTool("Discussions", "Student", 100, 4, "COB", new String[]{"Communication"});    //the actual tool data will go here,

        // made from a specific tool object
        Scanner userInput = new Scanner(System.in);
        String learnMore;
        System.out.println("The purpose of this application is to help you identify an academic tool that is right for you!"); //explain what the application is in more detail.
        System.out.println("What would you like to do today?\n\t0 = I want to find a tool\n\t1 = I want to browse tools by category\n\t" + //Question that leads to switch statement - what does the user want to do?
                "2 = I want to browse all tools\n\t3 = I want to add a new tool to the master tool list");
        System.out.print("Using the key above, enter a number 0 - 3: ");
        int userDecision = userInput.nextInt();

        System.out.println("__________________________________________________________________");

        switch (userDecision) {
            case 0: //I want to find a tool
                System.out.println("**Finding a New Tool**");
                System.out.println("We have a few more questions about you before we can find the perfect tool(s)!");
                System.out.println("\tWhat is your role at the university?\n\t\t0 = Student\n\t\t1 = Faculty\n\t\t2 = Staff");
                System.out.print("\t\tUsing the key above, enter a number 0 - 2: ");
                int userRole = userInput.nextInt();
                System.out.println("\n\tAll tools are organized in the following categories: " + tool.getTags());
                System.out.print("\tDo want to learn more about each category? Enter Y or N. ");
                learnMore = userInput.next();
                tool.getMoreInfo(learnMore);
                break;
            case 1: //I want to browse tools by category
                System.out.println("The tools are organized into the following categories: " + tool.getTags());
                System.out.print("Do want to learn more about each category? Enter Y or N. ");
                learnMore = userInput.next();
                tool.getMoreInfo(learnMore);
                break;
            case 2: //I want to browse all tools
                System.out.println("Here is a list of all tools, in alphabetic order");
                break;
            case 3: //I want to add a new tool to the master tool list
                System.out.println("Let's get some information about the new tool:");
                System.out.print("Tool Name: ");
                String newName = userInput.next();
                System.out.print("Select best category to describe this tool: " + tool.getTags());
                String newTag = userInput.next();
                System.out.println("");

                break;
        }


//
//        System.out.println("__________________________________________________________________");
//        System.out.print("What is your role at the university? Enter one of the following numbers: 0 = student, 1 = faculty, 2 = staff ");
//        int userRole = userInput.nextInt();
//        System.out.println("What would you like to do next? Enter one of the following numbers: 0 = read about each tool category");
//        System.out.print("Explore categories that best apply to tool type you're looking for. Enter one or more of the following numbers:  " +
//                "0 = Analytics & Statistics, 1 = Communication, 2 = Content Delivery, 3 = Simulation, 4 = STEM, 5 = Visual ");
//        System.out.println("Note: If entering multiple categories, separate them by a comma");
//        int[] tags = new int[]{userInput.nextInt()};
//        System.out.println(tags);
    }
}