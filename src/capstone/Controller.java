package capstone;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) throws IOException {
        String firstName;
        String lastName;
        FileReader inputStream = null;
        FileWriter outputStream = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to your Budgeting App! Let's get started.");
        System.out.println("What is your first name?");
        firstName = userInput.next();
        System.out.println("What is your last name?");
        lastName = userInput.next();
        System.out.println("Let's see if you have an account!");
        String filePath = "src/capstone/account-info/" + firstName + "-" + lastName + ".txt";
        File userAccountInfo = new File(filePath);
        try (FileReader in = new FileReader(userAccountInfo)) {
            User existingUser = new User();

            System.out.println("Looks like we have information for you!");
            Services.populateVariablesFromFile(firstName, lastName, existingUser);
            mainMenu(existingUser, userAccountInfo);
        } catch (IOException exc) {
            System.out.println("Looks like we don't have any information about you. Let's get some more information.");
            createAccount(firstName, lastName);
        }
    }


    public static void createAccount(String firstName, String lastName) throws IOException {
        Scanner userInput = new Scanner(System.in);
        double incomeMonthly;
        double oneTimeIncome;
        boolean hasHome;
        double priceHome;
        double homeInterestRate;
        ArrayList<Debt> debtOwed = new ArrayList<>();
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
        System.out.println("Monthly Income (format: 0.00): ");
        incomeMonthly = userInput.nextDouble();
        System.out.println("Extra/One-Time Income: ");
        oneTimeIncome = userInput.nextDouble();
        System.out.println("Do you own a home? (true/false)");
        hasHome = userInput.nextBoolean();
        if (hasHome) {
            System.out.println("Price of Home (format: 0.00): ");
            priceHome = userInput.nextDouble();
            System.out.println("Mortgage Interest Rate: ");
            homeInterestRate = userInput.nextDouble();
        } else {
            priceHome = 0;
            homeInterestRate = 0;
        }
        System.out.println("Do you owe any debt (credit cards, student loans, etc)? (true/false)");
        //debtOwed = userInput; come back
        System.out.println("Weekly Cost for Groceries (format 0.00)");
        weeklyCostGroceries = userInput.nextDouble();
        System.out.println("Weekly Cost for Take-Out (format 0.00)");
        weeklyCostTakeOut = userInput.nextDouble();
        System.out.println("On average, how many times a week do you get take-out?");
        numWeeklyTakeOut = userInput.nextInt();
        System.out.println("Weekly Cost for Alcohol (wine, beer, liquor): ");
        weeklyCostAlcohol = userInput.nextDouble();
        System.out.println("Monthly Healthcare Cost: ");
        monthlyCostHealth = userInput.nextDouble();
        System.out.println("Monthly Childcare Cost: ");
        monthlyCostChildcare = userInput.nextDouble();
        System.out.println("Monthly Car Insurance Cost: ");
        monthlyCostCarInsurance = userInput.nextDouble();
        System.out.println("Monthly Car Payment: ");
        monthlyCarPayment = userInput.nextDouble();
        System.out.println("Monthly Gas Cost: ");
        monthlyGas = userInput.nextDouble();
        System.out.println("Monthly Cellphone Cost: ");
        monthlyCellPhone = userInput.nextDouble();
        System.out.println("Cost of Monthly TV/Streaming services (Netflix, Hulu, etc): ");
        monthlyTV = userInput.nextDouble();
        System.out.println("Monthly Travel Cost: ");
        monthlyCostTravel = userInput.nextDouble();
        System.out.println("Monthly Savings: ");
        monthlySavings = userInput.nextDouble();
        User newUser = new User(firstName, lastName, incomeMonthly, oneTimeIncome, hasHome, priceHome, homeInterestRate, debtOwed, weeklyCostGroceries, weeklyCostTakeOut, numWeeklyTakeOut, weeklyCostAlcohol,
                monthlyCostHealth, monthlyCostChildcare, monthlyCostCarInsurance, monthlyCarPayment, monthlyGas, monthlyCellPhone, monthlyTV, monthlyCostTravel, monthlySavings);
        System.out.println(newUser.toString());
    }

    public static void mainMenu(User user, File userAccountInfo) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What would you like to do? Enter a number 0 to 6:"
                + "\n\t1) View Account Balances" + "\n\t2) View Overview Stats"
                + "\n\t3) Customize Your Budget (add/update/delete income & expenses)" +
                "\n\t4) Run Customized Reports" + "\n\t5) View/Update Your Account Information" + "\n\t6) Exit");
        int userDecision = userInput.nextInt();
        switch (userDecision){
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                user.viewUserAccountInfo(user, userAccountInfo);
                break;
            case 6:
                System.out.println("Application closed");
        }

    }
}
