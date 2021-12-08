package labs_examples.objects_classes_methods.labs.oop.D_my_oop.oop_JACKIE;

import java.util.ArrayList;

public class Tool {
    String name;
    String tags; //0 = Analytics & Statistics, 1 = Communication, 2 = Content Delivery, 3 = Simulation, 4 = STEM, 5 = Visual
    ArrayList<String> subTags;
    int tagCounter;
    int subTagCounter;
    int userRole; // 0 = Student, 1 = Faculty, 2 = Staff, 3 = All
    double costPerUser;
    int academicTechRating;
    String colleges;

    public Tool(String name, String tags, int userRole) {
        this.name = name;
        this.tags = tags;
    }

    public Tool() {
    }

    @Override
    public String toString() {
        return name;
    }


    //    public String getSubTags() {
//        return  "subTags=" + Arrays.toString(new String[]{subTags});
//    }
}
