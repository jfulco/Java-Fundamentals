package labs_examples.objects_classes_methods.labs.oop.D_my_oop.oop_JACKIE;

import java.util.Arrays;

public class Tool {
    String[] tags = new String[]{"Analytics & Statistics", "Communication", "Content Delivery", "Simulation", "STEM", "Visual"}; //array list of tags, to freely add and get rid of them
    int tagCounter;
    String toolName;
    String[] subTags = new String[]{"Discussions"};
    String userRole; // make an int
    double costPerUser;
    int academicTechRating;
    String colleges;

    public Tool(String[] subTags, String userRole, double costPerUser, int academicTechRating, String colleges, String[] tags) {
        this.subTags = subTags;
        this.userRole = userRole;
        this.costPerUser = costPerUser;
        this.academicTechRating = academicTechRating;
        this.colleges = colleges;
        this.tags = tags;
    }

    public Tool() {
    }

    public static void tagDescription(){

    }


    public void getMoreInfo(String userInput){
        if (userInput.equalsIgnoreCase("Y")) {
            System.out.println("************Eventually, this will return paragraphs about the tools");
            return;
        }
    }

    public String getTags() {
        return Arrays.toString(tags);
    }


    public String getSubTags() {
        return  "subTags=" + Arrays.toString(subTags);
    }
}
