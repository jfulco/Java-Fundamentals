package labs_examples.packages.community_service;

import labs_examples.objects_classes_methods.labs.oop.B_polymorphism.PolyExamples.SomeOtherClass;
import labs_examples.packages.employeeinfo.Person;

import java.util.ArrayList;
import java.util.Scanner;


public class VolunteerController {
    public static void main(String[] args) {
        ArrayList<Person> volunteerList = new ArrayList<>(7); //generates a list of all volunteers
        Person Mandy = new Person("Mandy", 30000, 7);
        Person Emily = new Person("Emily", 37000, 6);
        Person Nikki = new Person("Nikki", 35000, 1);
        Person Alex = new Person("Alex", 29000, 12);
        Person Jeff = new Person("Jeff", 30000, 4);
        Person Anna = new Person("Anna", 31000, 10);
        Person Carey = new Person("Carey", 32000, 15);
        volunteerList.add(Mandy);
        volunteerList.add(Emily);
        volunteerList.add(Nikki);
        volunteerList.add(Alex);
        volunteerList.add(Jeff);
        volunteerList.add(Anna);
        volunteerList.add(Carey);
        float percentageOfWorkWeek;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What day of the week is the volunteer event?" +
                "\n0 = Monday" +
                "\n1 = Tuesday" +
                "\n2 = Wednesday" +
                "\n3 = Thursday" +
                "\n4 = Friday");
        int workDay = userInput.nextInt();
        ArrayList<Person> currentVolunteers = new ArrayList<>();
        currentVolunteers = Services.volunteers(workDay,volunteerList);
        System.out.println("Your volunteers are " + currentVolunteers);
        System.out.println("How many total volunteer hours will " + currentVolunteers + " complete this week?");
        float volunteerHours = userInput.nextFloat();
        percentageOfWorkWeek = Services.percentageOfWorkWeek(volunteerHours);
        System.out.println(currentVolunteers + " will spend " + percentageOfWorkWeek + "% of their work week volunteering.");
        System.out.println("Each volunteer will receive a 5% increase in their week's paycheck for every hour worked. " +
                "\nSee conversions for " + currentVolunteers + " below: ");

            for (Person person : currentVolunteers) {
                System.out.println(person.name + " will earn $" + Services.volunteerWeeklyPay(person, volunteerHours) + " per week, including volunteer hours.");
                    }


    }


}
