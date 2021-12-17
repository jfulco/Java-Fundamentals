package labs_examples.packages.employeeinfo;

public class Person {
    public String name;
    public float initialPay;
    public float currentPay;
    float weeklyPay;
    public int yearsOfService;

    public Person(String name, float initialPay, int yearsOfService) {
        this.name = name;
        this.initialPay = initialPay;
        this.yearsOfService = yearsOfService;
        currentPay = initialPay;
        determineBonus(currentPay, yearsOfService); //this is protected and can only be accessed in the employeeinfo package
        calculateWeeklyPay(currentPay);
    }

    protected void determineBonus(float currentPay, int yearsOfService) { //determines the bonus for this object in the constructor
        float newPay;
        if (yearsOfService >= 20){
            newPay = currentPay*1.10f;
        } else{
            newPay = currentPay*1.05f;
        }
        setCurrentPay(newPay);
    }

    protected void calculateWeeklyPay(float currentPay){ //sets weekly pay for this object  in the constructor
        weeklyPay = currentPay / 52;
        setWeeklyPay(weeklyPay);
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) { //this is protected and can only be accessed in the employeeinfo package
        this.name = name;
    }

    public float getInitialPay() {
        return initialPay;
    }

    protected void setInitialPay(float initialPay) { //this is protected and can only be accessed in the employeeinfo package
        this.initialPay = initialPay;
    }

    public float getCurrentPay() {
        return currentPay;
    }

    protected void setCurrentPay(float currentPay) { //this is protected and can only be accessed in the employeeinfo package
        this.currentPay = currentPay;
    }

    public float getWeeklyPay() {
        return weeklyPay;
    }

    public void setWeeklyPay(float weeklyPay) {
        this.weeklyPay = weeklyPay;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    protected void setYearsOfService(int yearsOfService) { //this is protected and can only be accessed in the employeeinfo package
        this.yearsOfService = yearsOfService;
    }

    @Override
    public String toString() {
        return this.name;
    }
}



