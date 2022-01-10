package capstone;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    String firstName;
    String lastName;
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
    FileReader inputStream = null;
    FileWriter outputStream = null;
    String filePath = "src/capstone/account-info/" + firstName + "-" + lastName + ".txt";

    public User() {
    }

    public User(String firstName, String lastName,
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
        writeAccountInfoFile();
    }

    public void writeAccountInfoFile() throws IOException {
        try {
            outputStream = new FileWriter("src/capstone/account-info/" + firstName + "-" + lastName + ".txt");
            outputStream.write(firstName + "," + lastName + "," + incomeMonthly + "," + oneTimeIncome + "," + hasHome
                    + "," + priceHome + "," + homeInterestRate + "," + debtOwed + "," + weeklyCostGroceries + "," + weeklyCostTakeOut
                    + "," + numWeeklyTakeOut + "," + weeklyCostAlcohol + "," + monthlyCostHealth + "," + monthlyCostChildcare + ","
                    + monthlyCostCarInsurance + "," + monthlyCarPayment + "," + monthlyGas + "," + monthlyCellPhone + "," + monthlyTV
                    + "," + monthlyCostTravel + "," + monthlySavings);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null){
                outputStream.close();
            }
        }
    }

    public void generateDebtOwed(Debt debt){

    }

    public void viewUserAccountInfo(User user, File userAccountInfo) throws FileNotFoundException {
        System.out.println("Below is your current budget information:");
        try (BufferedReader br = new BufferedReader(new FileReader(userAccountInfo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println("0) First Name: " + values[0] +
                        "\n1) Last Name: " + values[1] +
                        "\n2) Monthly Income: " + values[2] +
                        "\n3) Extra/One-Time Income: " + values[3] +
                        "\n4) Do you own a home? " + values[4] +
                        "\n5) Price of Home: " + values[5] +
                        "\n6) Mortgage Interest Rate: " + values[6] +
                        "\n7) Do you owe any debt (credit cards, student loans, etc)?" + values[7] +
                        "\n8) Weekly Cost for Groceries: " + values[8] +
                        "\n9) Weekly Cost for Take-Out: " + values[9] +
                        "\n10) On average, how many times a week do you get take-out? " + values[10] +
                        "\n11) Weekly Cost for Alcohol (wine, beer, liquor): " + values[11] +
                        "\n12) Monthly Healthcare Cost: " + values[12] +
                        "\n13) Monthly Childcare Cost: " + values[13] +
                        "\n14) Monthly Car Insurance Cost: " + values[14] +
                        "\n15) Monthly Car Payment: " + values[15] +
                        "\n16) Monthly Gas Cost: " + values[16] +
                        "\n17) Monthly Cellphone Cost: " + values[17] +
                        "\n18) Cost of Monthly TV/Streaming services (Netflix, Hulu, etc): " + values[18] +
                        "\n19) Monthly Travel Cost: " + values[19] +
                        "\n20) Monthly Savings: " + values[20]);
            }
            updateUserAccountInfo(user, userAccountInfo);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //how do I make it replace the file instead of just creating a new one?
    public void updateUserAccountInfo(User user, File userAccountInfo) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Do you need to update any information? (true or false)");
        boolean wantsUpdate = userInput.nextBoolean();
        while (wantsUpdate) {
            System.out.println("What information would you like to update? (Enter 0 - 20)");
            int userDecision = userInput.nextInt();
            switch (userDecision) {
                case 0:
                    userAccountInfo.delete();
                    System.out.println("Enter your change: ");
                    setFirstName(userInput.next());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 1:
                    userAccountInfo.delete();
                    System.out.println("Enter your change: ");
                    setLastName(userInput.next());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 2:
                    System.out.println("Enter your change: ");
                    setIncomeMonthly(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 3:
                    System.out.println("Enter your change: ");
                    setOneTimeIncome(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 4:
                    System.out.println("Enter your change: ");
                    setHasHome(userInput.nextBoolean());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 5:
                    System.out.println("Enter your change: ");
                    setPriceHome(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 6:
                    System.out.println("Enter your change: ");
                    setHomeInterestRate(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
//                case 7:
//                    System.out.println("Enter your change: ");
//                    setDebtOwed(userInput.nextInt());
//                    System.out.println("Do you need to update more information? (true or false)");
//                    wantsUpdate = userInput.nextBoolean();
//                    continue;
                case 8:
                    System.out.println("Enter your change: ");
                    setWeeklyCostGroceries(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 9:
                    System.out.println("Enter your change: ");
                    setWeeklyCostTakeOut(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 10:
                    System.out.println("Enter your change: ");
                    setNumWeeklyTakeOut(userInput.nextInt());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 11:
                    System.out.println("Enter your change: ");
                    setWeeklyCostAlcohol(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 12:
                    System.out.println("Enter your change: ");
                    setMonthlyCostHealth(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 13:
                    System.out.println("Enter your change: ");
                    setMonthlyCostChildcare(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 14:
                    System.out.println("Enter your change: ");
                    setMonthlyCostCarInsurance(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 15:
                    System.out.println("Enter your change: ");
                    setMonthlyCarPayment(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 16:
                    System.out.println("Enter your change: ");
                    setMonthlyGas(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 17:
                    System.out.println("Enter your change: ");
                    setMonthlyCellPhone(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 18:
                    System.out.println("Enter your change: ");
                    setMonthlyTV(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 19:
                    System.out.println("Enter your change: ");
                    setMonthlyCostTravel(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
                case 20:
                    System.out.println("Enter your change: ");
                    setMonthlySavings(userInput.nextDouble());
                    System.out.println("Do you need to update more information? (true or false)");
                    wantsUpdate = userInput.nextBoolean();
                    continue;
            }
        }
        try {
            writeAccountInfoFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Controller.mainMenu(user, userAccountInfo);
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

    public void setInputStream(FileReader inputStream) {
        this.inputStream = inputStream;
    }

    public void setOutputStream(FileWriter outputStream) {
        this.outputStream = outputStream;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
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
