package labs_examples.objects_classes_methods.labs.oop.D_my_oop.oop_JACKIE;

public class Tool {
    String tags;
    String subTags;
    String userRole;
    double costPerUser;
    int academicTechRating;
    String colleges;

    public Tool(String tags, String subTags, String userRole, double costPerUser, int academicTechRating, String colleges) {
        this.tags = tags;
        this.subTags = subTags;
        this.userRole = userRole;
        this.costPerUser = costPerUser;
        this.academicTechRating = academicTechRating;
        this.colleges = colleges;
    }

    public Tool() {
    }
}
