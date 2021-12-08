package labs_examples.objects_classes_methods.labs.oop.D_my_oop.oop_JACKIE;

import java.util.ArrayList;

public class MasterList {
    int tagsCounter;
    int subTagsCounter;
    private static String[] tagsList = new String[]{"Analytics & Statistics", "Communication", "Content Delivery", "Simulation", "STEM", "Visual"}; //keep as an array
    static String[] subTagsList = new String[]{"Discussions", "Presentations", "VR Technology", "Databases", "Cyber Security", "Mindmapping"}; //needs to be made an array list for scalability
    static String[] userRoleList = new String[]{"Student", "Faculty", "Staff", "All Users"}; //keep as an array
    static ArrayList<Tool> allTools = new ArrayList<Tool>();
    static ArrayList<Tool> analyticsStatisticsTools = new ArrayList<Tool>();
    static ArrayList<Tool> communicationTools = new ArrayList<Tool>();
    static ArrayList<Tool> contentDeliveryTools = new ArrayList<Tool>();
    static ArrayList<Tool> simulationTools = new ArrayList<Tool>();
    static ArrayList<Tool> stemTools = new ArrayList<Tool>();
    static ArrayList<Tool> visualTools = new ArrayList<Tool>();
    static ArrayList<Tool> studentTools = new ArrayList<Tool>();
    static ArrayList<Tool> facultyTools = new ArrayList<Tool>();
    static ArrayList<Tool> staffTools = new ArrayList<Tool>();
    static ArrayList<Tool> allUsersTools = new ArrayList<Tool>();


    public static void getMoreInfoTags() {
        System.out.println("************Eventually, this will return paragraphs about the tool tags");
    }

    public static void referenceTagsList() { //cycles through tags list array and returns them; used for referencing, not manipulating
        for (int i = 0; i < tagsList.length; i++) {
            System.out.println("\t\t" + i + " = " + tagsList[i]);
        }
    }

    public static void referenceSubTagsList() { //cycles through sub tags list array and returns them; used for referencing, not manipulating
        for (int i = 0; i < subTagsList.length; i++) {
            System.out.println("\t\t" + i +  " = " + subTagsList[i]);
        }
    }

    public static String getTagsList(int i) { //gets a value from the tags list at a certain index, used for manipulating
        return tagsList[i];
    }

    public static String getSubTagsList(int i) { //gets a value from the tags list at a certain index, used for manipulating
        return subTagsList[i];
    }

    public static String getUserRoleList(int i) { //gets a value from the user role list at a certain index, used for manipulating
        return userRoleList[i];
    }

    public static void addToAllTools(Tool name) {
        allTools.add(name);
    }

    public static void addToAnalyticsStatisticsTools(Tool name) {
        analyticsStatisticsTools.add(name);
    }

    public static void addToCommunicationTools(Tool name) {
        communicationTools.add(name);
    }

    public static void addToContentDeliveryTools(Tool name) {
        contentDeliveryTools.add(name);
    }

    public static void addToSimulationTools(Tool name) {
        simulationTools.add(name);
    }

    public static void addToSTEMTools(Tool name) {
        stemTools.add(name);
    }

    public static void addVisualTools(Tool name) {
        visualTools.add(name);
    }

    public static void addToStudentTools(Tool name) {
        studentTools.add(name);
    }

    public static void addToFacultyTools(Tool name) {
        facultyTools.add(name);
    }
    public static void addToStaffTools(Tool name) {
        staffTools.add(name);
    }
    public static void addToAllUsersTools(Tool name) {
       allUsersTools.add(name);
    }

    public static void getAllTools() {
        for (Tool all : allTools) {
            System.out.println(all);
        }
    }

    public static void getAnalyticsStatisticsTools() {
        for (Tool all : analyticsStatisticsTools) {
            System.out.println(all);
        }
    }

    public static void getCommunicationTools() {
        for (Tool all : communicationTools) {
            System.out.println(all);
        }
    }

    public static void getContentDeliveryTools() {
        for (Tool all : contentDeliveryTools) {
            System.out.println(all);
        }
    }

    public static void getSimulationTools() {
        for (Tool all : simulationTools) {
            System.out.println(all);
        }
    }

    public static void getSTEMTools() {
        for (Tool all : stemTools) {
            System.out.println(all);
        }
    }

    public static void getVisualTools() {
        for (Tool all : visualTools) {
            System.out.println(all);
        }
    }
}
