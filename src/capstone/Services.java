package capstone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Services {
    public static void populateVariablesFromFile(String firstName, String lastName, User user) { //opportunity for a thread
        String filePath = "src/capstone/account-info/" + firstName + "-" + lastName + ".txt";
        User existingUser = user;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                existingUser.setFirstName(values[0]);
                existingUser.setLastName(values[1]);
                existingUser.setIncomeMonthly(Double.parseDouble(values[2]));
                existingUser.setOneTimeIncome(Double.parseDouble(values[3]));
                existingUser.setHasHome(Boolean.parseBoolean(values[4]));
                existingUser.setPriceHome(Double.parseDouble(values[5]));
                existingUser.setHomeInterestRate(Double.parseDouble(values[6]));
//              existingUser.setDebtOwed(values[7]);
                existingUser.setWeeklyCostGroceries(Double.parseDouble(values[8]));
                existingUser.setWeeklyCostTakeOut(Double.parseDouble(values[9]));
                existingUser.setNumWeeklyTakeOut(Integer.parseInt(values[10]));
                existingUser.setWeeklyCostAlcohol(Double.parseDouble(values[11]));
                existingUser.setMonthlyCostHealth(Double.parseDouble(values[12]));
                existingUser.setMonthlyCostChildcare(Double.parseDouble(values[13]));
                existingUser.setMonthlyCostCarInsurance(Double.parseDouble(values[14]));
                existingUser.setMonthlyCarPayment(Double.parseDouble(values[15]));
                existingUser.setMonthlyGas(Double.parseDouble(values[16]));
                existingUser.setMonthlyCellPhone(Double.parseDouble(values[17]));
                existingUser.setMonthlyTV(Double.parseDouble(values[18]));
                existingUser.setMonthlyCostTravel(Double.parseDouble(values[19]));
                existingUser.setMonthlySavings(Double.parseDouble(values[20]));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
