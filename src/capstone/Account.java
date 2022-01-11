package capstone;

import java.util.ArrayList;

public class Account {
    double startingBalance;
    int accountType;
    User user = new User();
    double currentBalance;

    public Account(double startingBalance, int accountType, User user) {
        this.startingBalance = startingBalance;
        this.accountType = accountType;
        this.user = user;
        setCurrentBalance(startingBalance, user);
    }

    public Account() {
    }

    public double getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance, User user) {
        currentBalance = user.getIncomeMonthly() + user.getOneTimeIncome()
                + startingBalance;
    }

    public void deductMonthlyExpenses(User user) {
        currentBalance = currentBalance - (user.getWeeklyCostGroceries()
                + user.getWeeklyCostAlcohol() + user.getMonthlyCostHealth()
                + user.getMonthlyCostChildcare() + user.getMonthlyCostCarInsurance()
                + user.getMonthlyCarPayment() + user.getMonthlyGas()
                + user.getMonthlyCellPhone() + user.getMonthlyTV() + user.getMonthlyCostTravel()
                + user.getMonthlySavings());
    }

    public void addMonthlyIncome(User user) {
        currentBalance = currentBalance + user.getIncomeMonthly() + user.getOneTimeIncome();
    }



    public void generateSavingsAccount(User user) {
        this.user = user;

}

    @Override
    public String toString() {
        return "Account{" +
                "startingBalance=" + startingBalance +
                ", accountType=" + accountType +
                ", user=" + user +
                '}';
    }
}
