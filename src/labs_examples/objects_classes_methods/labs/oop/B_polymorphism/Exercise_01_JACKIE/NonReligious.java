package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.Exercise_01_JACKIE;

public class NonReligious extends Holidays{
    //instance variables
    private boolean isVeteran;

    //methods & controllers

    public NonReligious(String name, String month, int startDate, int endDate, boolean offWork, boolean hasGiftGiving, double annualCostPerPerson, boolean isVeteran) {
        super(name, month, startDate, endDate, offWork, hasGiftGiving, annualCostPerPerson);
        this.isVeteran = isVeteran;
    }

    //getter & setters
    public boolean isVeteran() {
        return isVeteran;
    }

    public void setVeteran(boolean veteran) {
        isVeteran = veteran;
    }
}
