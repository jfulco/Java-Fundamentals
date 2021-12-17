package labs_examples.packages.community_service;

import labs_examples.packages.employeeinfo.Person;

import java.util.ArrayList;

public class Services {
    Person[] volunteerInfo = new Person[7];

    protected static float percentageOfWorkWeek(float volunteerHours) { //the controller can access this because its in the same package
        float quotient = volunteerHours / 40;
        float percentage = quotient * 100;
        return percentage;
    }

    protected static float volunteerWeeklyPay(Person person, float numHoursWorked){
        float weeklyPay = person.getWeeklyPay(); //have to use getweeklypay instead of just calculate weekly pay because the
        // calculateWeeklyPay method is protected in the Person class/employeeinfo package
        float percentIncrease = (numHoursWorked*0.05f);//5% increase in pay for every hour worked
        float volunteerPay = weeklyPay + percentIncrease;
        return volunteerPay;
    }


    public static ArrayList<Person> volunteers(int workDay, ArrayList<Person> volunteerList) { //this method takes in the work day from the controller to determine
        // who is able to volunteer on a specific day of the week
        ArrayList<Person> tempList = new ArrayList<>(2);
        switch (workDay) {
            case 0: //Monday
                tempList.add(volunteerList.get(0));
                tempList.add(volunteerList.get(1));
                tempList.add(volunteerList.get(2));
                break;
            case 1: //Tuesday
                tempList.add(volunteerList.get(0));
                tempList.add(volunteerList.get(1));
                tempList.add(volunteerList.get(2));
                tempList.add(volunteerList.get(3));
                break;
            case 2: //Wednesday
                tempList.add(volunteerList.get(0));
                tempList.add(volunteerList.get(1));
                tempList.add(volunteerList.get(2));
                tempList.add(volunteerList.get(3));
                tempList.add(volunteerList.get(4));
                break;
            case 3: //Thursday
                tempList.add(volunteerList.get(0));
                tempList.add(volunteerList.get(1));
                break;
            case 4: //Friday
                tempList.add(volunteerList.get(0));
                tempList.add(volunteerList.get(1));
                tempList.add(volunteerList.get(2));
                tempList.add(volunteerList.get(4));
                break;
        }

        return tempList;
    }
}
