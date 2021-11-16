package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_JACKIE;

public class HolidaysController {
    public static void main(String[] args) {
        Religious christmas = new Religious("Christmas", "December", 24, 25, true,true, 998);


        System.out.println(christmas.getName());
        System.out.println(christmas.getName() + " is on " + christmas.getMonth() + " " +
                christmas.getStartDate() + " and ends on " + christmas.getMonth() + " " + christmas.getEndDate() + ".");
        System.out.println("You'll have " + christmas.numDays() + " days of celebration!");
    }
}
