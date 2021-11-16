package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_JACKIE;

public class Holidays {
    //instance variables
    private String name;
    private String month;
    private int startDate;
    private int endDate;
    private boolean offWork;
    private boolean hasGiftGiving;
    private double annualCostPerPerson;


    //methods & constructors

    //default constructor
    public Holidays() {}

    public Holidays(String name, String month, int startDate, int endDate, boolean offWork, boolean hasGiftGiving, double annualCostPerPerson) {
        this.name = name;
        this.month = month;
        this.startDate = startDate;
        this.endDate = endDate;
        this.offWork = offWork;
        this.hasGiftGiving = hasGiftGiving;
        this.annualCostPerPerson = annualCostPerPerson;
    }

    public int numDays(){
        int numDays = (endDate - startDate) + 1;
        return numDays;
    }

    public void offWork(){
        if (offWork == true){
            System.out.println("Woohoo! Holiday break.");
        } else {
            System.out.println("Bummer, no holiday break.");        }

    }

    public void hasGiftGiving(){
        if (hasGiftGiving){
            System.out.println("Start buying gifts!");
        }
    }

    //getter & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public boolean isOffWork() {
        return offWork;
    }

    public void setOffWork(boolean offWork) {
        this.offWork = offWork;
    }

    public boolean isHasGiftGiving() {
        return hasGiftGiving;
    }

    public void setHasGiftGiving(boolean hasGiftGiving) {
        this.hasGiftGiving = hasGiftGiving;
    }

    public double getAnnualCostPerPerson() {
        return annualCostPerPerson;
    }

    public void setAnnualCostPerPerson(double annualCostPerPerson) {
        this.annualCostPerPerson = annualCostPerPerson;
    }
}
