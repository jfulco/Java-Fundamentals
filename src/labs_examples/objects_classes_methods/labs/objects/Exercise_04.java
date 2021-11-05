package labs_examples.objects_classes_methods.labs.objects;

class TermSchedule {

        public static void main(String[] args) {
            Course fall = new Course("MATH", 140);
            Course spring = new Course("MATH", 141);
            Course summer = new Course("MATH", 241);
            Course winter = new Course();
            Course weekDay = new Course("Saturday & Sunday");

            System.out.println("Your course for the fall is " + fall.catalog + " " + fall.subject);
            System.out.println("Your course for the spring is " + spring.catalog + " " + spring.subject);
            System.out.println("Your course for the summer is " + summer.catalog + " " + summer.subject);
            System.out.println(winter.noCourse + " for the winter term");
            System.out.println("Luckily, you'll get a break on " + weekDay.weekDay);
        }

}

class Course {

    String catalog;
    int subject;
    String noCourse = "No course scheduled";
    String weekDay;

    //Overload constructor - if there is no course
    public Course(){
    }

    public Course(String weekDay){
        this.weekDay = weekDay;
    }


    public Course(String catalog, int subject){
        this.catalog = catalog;
        this.subject = subject;
    }





}
