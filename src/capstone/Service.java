package capstone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    public static User saveUser(User user) throws SQLException { //this is where validation happens
        Database database = new Database();
        return database.persistUser(user);
    }

    public static User getUserData(User user) throws SQLException {
        Database database = new Database();
        return database.findUserByEmail(user.getEmailAddress());
    }

    public static User getUserData(String emailAddress) throws SQLException {
        Database database = new Database();
        return database.findUserByEmail(emailAddress);
    }

    public static User createUserAccount(User newUser) throws SQLException, IOException {
        Scanner userInput = new Scanner(System.in);
        String firstName;
        String lastName;
        String emailAddress;
        double incomeMonthly;
        double oneTimeIncome;
        boolean hasHome;
        double priceHome;
        double homeInterestRate;
        double monthlyRent;
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
        boolean hasBankAccountInformation;
        boolean hasDebtInformation;
        System.out.println("What is your first name?");
        firstName = userInput.next();
        System.out.println("What is your last name?");
        lastName = userInput.next();
        System.out.println("What is your email address?");
        emailAddress = userInput.next();
        System.out.println("Monthly Income: ");
        incomeMonthly = userInput.nextDouble();
        System.out.println("Expected extra monthly income: ");
        oneTimeIncome = userInput.nextDouble();
        System.out.println("Do you own a home? (true/false)");
        hasHome = userInput.nextBoolean();
        if (hasHome) {
            monthlyRent = 0;
            System.out.println("Mortgage Total: ");
            priceHome = userInput.nextDouble();
            System.out.println("Mortgage Interest Rate: ");
            homeInterestRate = userInput.nextDouble();
        } else {
            priceHome = 0;
            homeInterestRate = 0;
            System.out.println("How much do you pay a month in rent?");
            monthlyRent = userInput.nextDouble();
        }
        System.out.println("Do you owe any debt (credit cards, student loans, etc)? (true/false)");
        hasDebtInformation = userInput.nextBoolean();
        while (hasDebtInformation != true & hasDebtInformation != false) {
            System.out.println("Sorry, your entry is invalid. Try again.");
            hasDebtInformation = userInput.nextBoolean();
        }
        while (hasDebtInformation) {
            String lenderName;
            double totalOwed;
            int paymentDue;
            double interestRate;
            System.out.println("What is the name of the lender?");
            lenderName = userInput.next();
            System.out.println("How much do you owe" + lenderName + " to date?");
            totalOwed = userInput.nextDouble();
            System.out.println("What day of the month do you pay your " + lenderName + " bill?");
            paymentDue = userInput.nextInt();
            System.out.println("What is your interest rate for your " + lenderName + " debt?");
            interestRate = userInput.nextDouble();
            Debt debt = new Debt(lenderName, totalOwed, paymentDue, interestRate, newUser);
            newUser.updateTotalDebtOwed(debt);
            System.out.println("Do you have another debt to enter? (true or false)");
            hasDebtInformation = userInput.nextBoolean();
            continue;
        }
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
        newUser = new User(firstName, lastName, emailAddress, incomeMonthly, oneTimeIncome, hasHome, priceHome, homeInterestRate, debtOwed,
                weeklyCostGroceries, weeklyCostTakeOut, numWeeklyTakeOut, weeklyCostAlcohol,
                monthlyCostHealth, monthlyCostChildcare, monthlyCostCarInsurance, monthlyCarPayment, monthlyGas,
                monthlyCellPhone, monthlyTV, monthlyCostTravel, monthlySavings);
        System.out.println("Do you have a bank account to enter? (true or false)");
        hasBankAccountInformation = userInput.nextBoolean();
        Account checkingAccount;
        Account savingsAccount;
        while (hasBankAccountInformation) {
            int accountType;
            double startingBalance;
            String[] accountTypeNames = {"Checking", "Savings"};
            System.out.println("What type of account is this?" + "\n0 = Checking" + "\n1 = Savings");
            accountType = userInput.nextInt();
            while (accountType != 0 & accountType != 1) {
                System.out.println("Sorry, your entry is invalid. Try again.");
                accountType = userInput.nextInt();
                break;
            }
            System.out.println("What is the current balance of your " + accountTypeNames[accountType] + " account?");
            startingBalance = userInput.nextDouble();
            if (accountType == 1) {
                checkingAccount = new Account(startingBalance, accountType, newUser);
            } else {
                savingsAccount = new Account(startingBalance, accountType, newUser);
            }
            System.out.println("Do you have another bank account to enter? (true or false)");
            hasBankAccountInformation = userInput.nextBoolean();
            continue;
        }
        System.out.println(newUser.toString());
        return saveUser(newUser);
    }

    public static User updateUserAccount(User user, boolean wantsUpdate) throws SQLException {
        Database database = new Database();
        Scanner userInput = new Scanner(System.in);
        while (wantsUpdate) {
            System.out.println("What information would you like to update? (Enter 0 - 20)");
            System.out.println("0) First Name: " + user.getFirstName()+
                        "\n1) Last Name: " + user.getLastName() +
                        "\n2) Monthly Income: " + user.getIncomeMonthly()+
                        "\n3) Extra/One-Time Income: " + user.getOneTimeIncome()+
                        "\n5) Price of Home: " + user.getPriceHome()+
                        "\n6) Mortgage Interest Rate: " + user.getHomeInterestRate() +
                        "\n8) Weekly Cost for Groceries: " + user.getWeeklyCostGroceries() +
                        "\n9) Weekly Cost for Take-Out: " + user.getWeeklyCostTakeOut()+
                        "\n10) On average, how many times a week do you get take-out? " + user.getNumWeeklyTakeOut()+
                        "\n11) Weekly Cost for Alcohol (wine, beer, liquor): " + user.getWeeklyCostAlcohol()+
                        "\n12) Monthly Healthcare Cost: " + user.getMonthlyCostHealth() +
                        "\n13) Monthly Childcare Cost: " + user.getMonthlyCostChildcare() +
                        "\n14) Monthly Car Insurance Cost: " + user.getMonthlyCostCarInsurance() +
                        "\n15) Monthly Car Payment: " + user.getMonthlyCarPayment() +
                        "\n16) Monthly Gas Cost: " + user.getMonthlyGas() +
                        "\n17) Monthly Cellphone Cost: " + user.getMonthlyCellPhone() +
                        "\n18) Cost of Monthly TV/Streaming services (Netflix, Hulu, etc): " + user.getMonthlyTV() +
                        "\n19) Monthly Travel Cost: " + user.getMonthlyCostTravel() +
                        "\n20) Monthly Savings: " + user.getMonthlySavings());
            }
            int userDecision = userInput.nextInt();
//            switch (userDecision) {
//                case 0:
//
//                    continue;
//                case 1:
//
//                    continue;
//                case 2:
//
//                    continue;
//                case 3:
//
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 4:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 5:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 6:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
////                case 7:
////                    System.out.println("Enter your change: ");
////                    setDebtOwed(userInput.nextInt());
////                    System.out.println("Do you need to update more information? (true or false)");
////                    wantsUpdate = userInput.nextBoolean();
////                    continue;
//                case 8:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 9:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 10:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 11:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 12:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 13:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 14:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 15:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 16:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 17:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 18:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 19:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//                case 20:
//
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
//            }

        //            writeAccountInfoFile();



















        return database.findUserByEmail(user.getEmailAddress());
    }

    public static void openMainMenu(User user) throws FileNotFoundException, SQLException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What would you like to do? Enter a number 0 to 6:"
                + "\n\t0) View Account Balances" + "\n\t1) View Overview Stats"
                + "\n\t2) Customize Your Budget (add/update/delete income & expenses)" +
                "\n\t3) Run Customized Reports" + "\n\t4) View Your Account Information" + "\n\t5) Edit Your Account Information" + "\n\t6) Exit");
        int userDecision = userInput.nextInt();
        switch (userDecision) {
            case 0:
                user.monthlyAccountBalances();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.out.println(Service.getUserData(user));
                break;
            case 5:
                System.out.println(Service.updateUserAccount(user, true));;
                break;
            case 6:
                System.out.println("Application closed");
        }

    }
}

