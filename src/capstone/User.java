package capstone;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    Integer userID;
    String firstName;
    String lastName;
    String emailAddress;
    double incomeMonthly;
    double oneTimeIncome;
    boolean hasHome;
    double priceHome;
    double homeInterestRate;
    double weeklyCostGroceries;
    double weeklyCostTakeOut;
    int numWeeklyTakeOut;
    double weeklyCostAlcohol;
    double monthlyCostHealth;
    double monthlyCostChildcare;
    double monthlyCostCarInsurance;
    double monthlyCarPayment;
    double monthlyGas;
    double monthlyCellPhone;
    double monthlyTV;
    double monthlyCostTravel;
    double monthlySavings;
    double startingAccountBalance;
    ArrayList<Debt> debtOwed = new ArrayList<>();
    ArrayList<Account> allAccounts = new ArrayList<>();
    //add monthlyRent as a parameter
    //add Debt array as a parameter


    public User() {
    }


    public User(String firstName, String lastName, String emailAddress,
                double incomeMonthly, double oneTimeIncome,
                boolean hasHome, double priceHome, double homeInterestRate,
                ArrayList<Debt> debtOwed, double weeklyCostGroceries,
                double weeklyCostTakeOut, int numWeeklyTakeOut, double weeklyCostAlcohol,
                double monthlyCostHealth, double monthlyCostChildcare,
                double monthlyCostCarInsurance, double monthlyCarPayment,
                double monthlyGas, double monthlyCellPhone, double monthlyTV,
                double monthlyCostTravel, double monthlySavings) throws IOException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.incomeMonthly = incomeMonthly;
        this.oneTimeIncome = oneTimeIncome;
        this.hasHome = hasHome;
        this.priceHome = priceHome;
        this.homeInterestRate = homeInterestRate;
        this.debtOwed = debtOwed;
        this.weeklyCostGroceries = weeklyCostGroceries;
        this.weeklyCostTakeOut = weeklyCostTakeOut;
        this.numWeeklyTakeOut = numWeeklyTakeOut;
        this.weeklyCostAlcohol = weeklyCostAlcohol;
        this.monthlyCostHealth = monthlyCostHealth;
        this.monthlyCostChildcare = monthlyCostChildcare;
        this.monthlyCostCarInsurance = monthlyCostCarInsurance;
        this.monthlyCarPayment = monthlyCarPayment;
        this.monthlyGas = monthlyGas;
        this.monthlyCellPhone = monthlyCellPhone;
        this.monthlyTV = monthlyTV;
        this.monthlyCostTravel = monthlyCostTravel;
        this.monthlySavings = monthlySavings;
        double totalMonthlyIncome = incomeMonthly + oneTimeIncome;
        double totalMonthlyExpense = monthlyCostHealth + monthlyCostChildcare + monthlyCostCarInsurance
                + monthlyCarPayment + monthlyGas + monthlyCellPhone + monthlyTV + monthlyCostTravel + monthlySavings + calculateMonthlyMortgageCost(priceHome, homeInterestRate);
//        Account account = new Account(startingAccountBalance);
//        account.accountBalance(incomeMonthly);
    }

    public double calculateMonthlyMortgageCost(double priceHome, double homeInterestRate){
        return priceHome + (priceHome*(homeInterestRate/100));
    }

    public void monthlyAccountBalances(){
        Scanner userInput = new Scanner(System.in);
        Account account = new Account();
        int userDecision;
        this.monthlySavings = monthlySavings;
        System.out.println("What would you like to view: ");
        System.out.println("1) Checking Account" + "\n2) Savings Account");
        userDecision = userInput.nextInt();
        switch (userDecision){
            case 1:
                System.out.println("You currently have: " + account.getCurrentBalance());
            case 2:
        }
    }

    public void updateTotalDebtOwed(Debt debt){
        debtOwed.add(debt);
    }




    //how do I make it replace the file instead of just creating a new one?
    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIncomeMonthly(double incomeMonthly) {
        this.incomeMonthly = incomeMonthly;
    }

    public void setOneTimeIncome(double oneTimeIncome) {
        this.oneTimeIncome = oneTimeIncome;
    }

    public void setHasHome(boolean hasHome) {
        this.hasHome = hasHome;
    }

    public void setPriceHome(double priceHome) {
        this.priceHome = priceHome;
    }

    public void setHomeInterestRate(double homeInterestRate) {
        this.homeInterestRate = homeInterestRate;
    }

    public void setDebtOwed(ArrayList<Debt> debtOwed) {
        this.debtOwed = debtOwed;
    }

    public void setWeeklyCostGroceries(double weeklyCostGroceries) {
        this.weeklyCostGroceries = weeklyCostGroceries;
    }

    public void setWeeklyCostTakeOut(double weeklyCostTakeOut) {
        this.weeklyCostTakeOut = weeklyCostTakeOut;
    }

    public void setNumWeeklyTakeOut(int numWeeklyTakeOut) {
        this.numWeeklyTakeOut = numWeeklyTakeOut;
    }

    public void setWeeklyCostAlcohol(double weeklyCostAlcohol) {
        this.weeklyCostAlcohol = weeklyCostAlcohol;
    }

    public void setMonthlyCostHealth(double monthlyCostHealth) {
        this.monthlyCostHealth = monthlyCostHealth;
    }

    public void setMonthlyCostChildcare(double monthlyCostChildcare) {
        this.monthlyCostChildcare = monthlyCostChildcare;
    }

    public void setMonthlyCostCarInsurance(double monthlyCostCarInsurance) {
        this.monthlyCostCarInsurance = monthlyCostCarInsurance;
    }

    public void setMonthlyCarPayment(double monthlyCarPayment) {
        this.monthlyCarPayment = monthlyCarPayment;
    }

    public void setMonthlyGas(double monthlyGas) {
        this.monthlyGas = monthlyGas;
    }

    public void setMonthlyCellPhone(double monthlyCellPhone) {
        this.monthlyCellPhone = monthlyCellPhone;
    }

    public void setMonthlyTV(double monthlyTV) {
        this.monthlyTV = monthlyTV;
    }

    public void setMonthlyCostTravel(double monthlyCostTravel) {
        this.monthlyCostTravel = monthlyCostTravel;
    }

    public void setMonthlySavings(double monthlySavings) {
        this.monthlySavings = monthlySavings;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getIncomeMonthly() {
        return incomeMonthly;
    }

    public double getOneTimeIncome() {
        return oneTimeIncome;
    }

    public boolean getHasHome() {
        return hasHome;
    }

    public double getPriceHome() {
        return priceHome;
    }

    public double getHomeInterestRate() {
        return homeInterestRate;
    }

    public ArrayList<Debt> getDebtOwed() {
        return debtOwed;
    }

    public double getWeeklyCostGroceries() {
        return weeklyCostGroceries;
    }

    public double getWeeklyCostTakeOut() {
        return weeklyCostTakeOut;
    }

    public int getNumWeeklyTakeOut() {
        return numWeeklyTakeOut;
    }

    public double getWeeklyCostAlcohol() {
        return weeklyCostAlcohol;
    }

    public double getMonthlyCostHealth() {
        return monthlyCostHealth;
    }

    public double getMonthlyCostChildcare() {
        return monthlyCostChildcare;
    }

    public double getMonthlyCostCarInsurance() {
        return monthlyCostCarInsurance;
    }

    public double getMonthlyCarPayment() {
        return monthlyCarPayment;
    }

    public double getMonthlyGas() {
        return monthlyGas;
    }

    public double getMonthlyCellPhone() {
        return monthlyCellPhone;
    }

    public double getMonthlyTV() {
        return monthlyTV;
    }

    public double getMonthlyCostTravel() {
        return monthlyCostTravel;
    }

    public double getMonthlySavings() {
        return monthlySavings;
    }

    public double getStartingAccountBalance() {
        return startingAccountBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", incomeMonthly=" + incomeMonthly +
                ", oneTimeIncome=" + oneTimeIncome +
                ", hasHome=" + hasHome +
                ", priceHome=" + priceHome +
                ", homeInterestRate=" + homeInterestRate +
                ", debtOwed=" + debtOwed +
                ", weeklyCostGroceries=" + weeklyCostGroceries +
                ", weeklyCostTakeOut=" + weeklyCostTakeOut +
                ", numWeeklyTakeOut=" + numWeeklyTakeOut +
                ", weeklyCostAlcohol=" + weeklyCostAlcohol +
                ", monthlyCostHealth=" + monthlyCostHealth +
                ", monthlyCostChildcare=" + monthlyCostChildcare +
                ", monthlyCostCarInsurance=" + monthlyCostCarInsurance +
                ", monthlyCarPayment=" + monthlyCarPayment +
                ", monthlyGas=" + monthlyGas +
                ", monthlyCellPhone=" + monthlyCellPhone +
                ", monthlyTV=" + monthlyTV +
                ", monthlyCostTravel=" + monthlyCostTravel +
                ", monthlySavings=" + monthlySavings +
                '}';
    }
}
