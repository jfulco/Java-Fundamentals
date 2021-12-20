package labs_examples.objects_classes_methods.labs.oop.D_my_oop.oop_JACKIE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static labs_examples.objects_classes_methods.labs.oop.D_my_oop.oop_JACKIE.MasterList.subTagsList;
import static labs_examples.objects_classes_methods.labs.oop.D_my_oop.oop_JACKIE.MasterList.tagsList;

public class Services {
    static String learnMore;
    static int userRole;
    static ArrayList<Integer> subTags = new ArrayList<Integer>();
    static boolean isFree;
    static int selectTag;
    static int selectSubTags;


    public static void generateToolObjects() { //this method creates objects for each tool and passes it into the addToAllTools method. That method adds the tool object to the All Tools Array
        Tool figma = new Tool("Figma", "Analytics & Statistics", 2);
        MasterList.addToAllTools(figma);
        popluateToolsByTags(figma);
        popluateToolsByRole(figma);

        Tool yellowdig = new Tool("Yellowdig", "Communication", 2);
        MasterList.addToAllTools(yellowdig);
        popluateToolsByTags(yellowdig);
        popluateToolsByRole(yellowdig);

        Tool perusall = new Tool("Perusall", "Communication", 3);
        MasterList.addToAllTools(perusall);
        popluateToolsByTags(perusall);
        popluateToolsByRole(perusall);
    }

    public static void popluateToolsByTags(Tool name) { //helps add a tool to a list depending on tag
        if (name.tags == MasterList.getTagsList(0)) {
            MasterList.addToAnalyticsStatisticsTools(name);
        } else if (name.tags == MasterList.getTagsList(1)) {
            MasterList.addToCommunicationTools(name);
        } else if (name.tags == MasterList.getTagsList(2)) {
            MasterList.addToContentDeliveryTools(name);
        } else if (name.tags == MasterList.getTagsList(3)) {
            MasterList.addToSimulationTools(name);
        } else if (name.tags == MasterList.getTagsList(4)) {
            MasterList.addToSTEMTools(name);
        } else if (name.tags == MasterList.getTagsList(5)) {
            MasterList.addVisualTools(name);
        }
    }

    public static void popluateToolsByRole(Tool name) { //helps add a tool to a list depending on user role
        if (name.tags == MasterList.getUserRoleList(0)) {
            MasterList.addToStudentTools(name);
        } else if (name.tags == MasterList.getUserRoleList(1)) {
            MasterList.addToFacultyTools(name);
        } else if (name.tags == MasterList.getUserRoleList(2)) {
            MasterList.addToStaffTools(name);
        } else if (name.tags == MasterList.getUserRoleList(3)) {
            MasterList.addToAllUsersTools(name);
        }
    }


    public static void userDecision(int userDecision) { //switch statement for user decision for what to do next
        Tool tool = new Tool();

        popluateToolsByTags(tool);
        System.out.println("__________________________________________________________________");
        Scanner userInput = new Scanner(System.in);
        switch (userDecision) {
            case 0: //I want to find a tool
                System.out.println("**Finding a New Tool**");

                //setting variables based on user choice
                System.out.println("We have a few more questions about you before we can find the perfect tool(s)!");
                //ask user role
                System.out.println("\tWhat is your role at the university?\n\t\t0 = Student\n\t\t1 = Faculty\n\t\t2 = Staff");
                System.out.print("\tUsing the key above, enter a number 0 - 3: ");
                userRole = userInput.nextInt();

                //ask what category & if they want to learn about that category
                System.out.println("\n\tAll tools are organized in the following categories: ");
                MasterList.referenceTagsList();
                System.out.print("\tDo want to learn more about each category? Enter Y or N. ");
                        learnMore = userInput.next().toUpperCase(Locale.ROOT);

                        if (learnMore.equals("Y")) { //if user says Y, return summary of each category
                            MasterList.getMoreInfoTags();
                        } else if (!learnMore.equals("N")) { //if the user enters something other than Y or N
                            do {
                                System.out.println("\tInvalid Response. Try again: ");
                                learnMore = userInput.next();
                                if (learnMore.equals("Y")) { //if user says Y, return summary of each category
                                    MasterList.getMoreInfoTags();
                                    break;
                                } else if (learnMore.equals("N")){
                                    break;
                                }
                            } while (true);
                        }


                System.out.print("\tEnter the category (0 - 5) that best describes what you're looking for: ");
                selectTag = userInput.nextInt(); // put in a loop

                //ask what sub categories (What works for now)
                System.out.println("\n\tThere are several sub categories a tool can have.");
                MasterList.referenceSubTagsList();
                System.out.print("\tEnter the sub category (0 - 5) that best describe what you're looking for.");
                selectSubTags = userInput.nextInt();

//                do {
//                    selectTag = userInput.nextInt(); //how would I make it stop without the user having to enter a letter (see above)?
//                    //it only adds the first number I enter to the selected sub tags array
//                    subTags.add(selectSubTags);
//                } while (userInput.hasNextInt());

                //Is free?

                //Has free trial?

                //pass to analyze method to create temporary list of tool objects, returns a temporary list of tools based on user decisions
                Services.analyzeUserDecision(userRole, selectTag, selectSubTags);
                break;


                case 1: //I want to browse tools by category
                System.out.println("\n\tAll tools are organized in the following categories: ");
                MasterList.referenceTagsList();
                System.out.print("Do want to learn more about each category? Enter Y or N. ");
                learnMore = userInput.next();
                if (learnMore.equalsIgnoreCase("Y")) { //if user says Y, return summary of each category
                    MasterList.getMoreInfoTags();
                }
                System.out.print("Enter a number 0 - 5 to view all tools in that specific category: ");
                selectTag = userInput.nextInt();
                System.out.println("__________________________________________________________________");
                switch (selectTag) {
                    case 0:
                        System.out.println("**Browse All Analytics & Statistics Tools**");
                        MasterList.getAnalyticsStatisticsTools();
                        break;
                    case 1:
                        System.out.println("**Browse All Communication Tools**");
                        MasterList.getCommunicationTools();
                        break;
                    case 2:
                        System.out.println("**Browse All Content Delivery Tools**");
                        MasterList.getContentDeliveryTools();
                        break;
                    case 3:
                        System.out.println("**Browse All Simulation Tools**");
                        MasterList.getSimulationTools();
                        break;
                    case 4:
                        System.out.println("**Browse All STEM Tools**");
                        MasterList.getSTEMTools();
                        break;
                    case 5:
                        System.out.println("**Browse All Visual Tools**");
                        MasterList.getVisualTools();
                        break;
                }
                break;

            case 2: //I want to browse all tools
                System.out.println("**Browse All Tools**");
                System.out.println("Below is a list of all tools recommended for use at ERAU-Worldwide");
                MasterList.getAllTools();
                break;


            case 3: //I want to add a new tool to the master tool list
                System.out.println("Let's get some information about the new tool:");
                System.out.print("Tool Name: ");
                String newName = userInput.next();
                System.out.print("Select best category to describe this tool: ");
                String newTag = userInput.next();
                System.out.println("Select the best sub categories that describe this tool: ");
                String newSubTags = userInput.next();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + userDecision);
        }
    }

    public static void analyzeUserDecision(int userRole, int selectTag, int selectSubTags) {
        ArrayList<Tool> temporaryList = new ArrayList<>();

        if (userRole == 0) {
            temporaryList.addAll(MasterList.studentTools);
        } else if (userRole == 1) {
            temporaryList.addAll(MasterList.facultyTools);
        } else if (userRole == 2) {
            temporaryList.addAll(MasterList.staffTools);
        } else if (userRole == 3) {
            temporaryList.addAll(MasterList.allUsersTools);
        }

            if (selectTag == 0) {
                temporaryList.addAll(MasterList.analyticsStatisticsTools);
            } else if (selectTag == 1) {
                temporaryList.addAll(MasterList.communicationTools);
            } else if (selectTag == 2) {
                temporaryList.addAll(MasterList.contentDeliveryTools);
            } else if (selectTag == 3) {
                temporaryList.addAll(MasterList.simulationTools);
            } else if (selectTag == 4) {
                temporaryList.addAll(MasterList.stemTools);
            } else if (selectTag == 5) {
                temporaryList.addAll(MasterList.visualTools);
            }




            //to use subtags user input, search for subtags in tool object?


        for (Tool all : temporaryList) {
            System.out.println(all);
        }
    }

}

