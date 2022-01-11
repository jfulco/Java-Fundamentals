package capstone;

import java.sql.SQLException;

public class Database extends DBConnection{

    public User persistUser(User user) throws SQLException { //persisting User object to the database (saving it) -
        // in the service, a save user calls this method to allow for validation or data cleanup
            connect();
        statement.executeUpdate("INSERT INTO `capstone-data`.`users` (`firstName`, `lastName`,`emailAddress`, `incomeMonthly`, " +
                "`oneTimeIncome`, `priceHome`, " +
                "`homeInterestRate`, `weeklyCostGroceries`, `weeklyCostTakeOut`, " +
                "`numWeeklyTakeOut`, `weeklyCostAlcohol`, `monthlyCostHealth`, " +
                "`monthlyCostChildcare`, `monthlyCostCarInsurance`, `monthlyCarPayment`," +
                "`monthlyGas`, `monthlyCellPhone`, `monthlyTV`, `monthlyCostTravel`, `monthlySavings`) " +
                "VALUES ('" + user.getFirstName() + "', '"
                        + user.getLastName() + "', '" + user.getEmailAddress() + "','"
                        + user.getIncomeMonthly() + "','" + user.getOneTimeIncome() + "','" + user.getPriceHome() + "','"
                        + user.getHomeInterestRate() + "','" + user.getWeeklyCostGroceries() + "','"
                        + user.getWeeklyCostTakeOut() + "','" + user.getNumWeeklyTakeOut() + "','"
                        + user.getWeeklyCostAlcohol() + "','" + user.getMonthlyCostHealth() + "','"
                        + user.getMonthlyCostChildcare() + "','" + user.getMonthlyCostCarInsurance() + "','"
                        + user.getMonthlyCarPayment() + "','" + user.getMonthlyGas() + "','"
                        + user.getMonthlyCellPhone() + "','" + user.getMonthlyTV() + "','" + user.getMonthlyCostTravel()
                        + "','" + user.getMonthlySavings() + "');");
        close();
        return findUserByEmail(user.getEmailAddress());
    }

    public User findUserByEmail(String emailAddress) throws SQLException {
        connect();
        resultSet = statement.executeQuery("SELECT * FROM `capstone-data`.users WHERE emailAddress ='" + emailAddress + "'");
        User user = new User();
        while (resultSet.next()){
            user.setUserID(resultSet.getInt("UserID"));
            user.setFirstName(resultSet.getString("firstName"));
            user.setLastName(resultSet.getString("lastName"));
            user.setEmailAddress(resultSet.getString("emailAddress"));
            user.setIncomeMonthly(resultSet.getDouble("incomeMonthly"));
            user.setOneTimeIncome(resultSet.getDouble("oneTimeIncome"));
            user.setPriceHome(resultSet.getDouble("priceHome"));
            user.setHomeInterestRate(resultSet.getDouble("homeInterestRate"));
//              existingUser.setDebtOwed(values[7]);
            user.setWeeklyCostGroceries(resultSet.getDouble("weeklyCostGroceries"));
            user.setWeeklyCostTakeOut(resultSet.getDouble("weeklyCostTakeOut"));
            user.setNumWeeklyTakeOut(resultSet.getInt("numWeeklyTakeOut"));
            user.setWeeklyCostAlcohol(resultSet.getDouble("weeklyCostAlcohol"));
            user.setMonthlyCostHealth(resultSet.getDouble("monthlyCostHealth"));
            user.setMonthlyCostChildcare(resultSet.getDouble("monthlyCostChildcare"));
            user.setMonthlyCostCarInsurance(resultSet.getDouble("monthlyCostCarInsurance"));
            user.setMonthlyCarPayment(resultSet.getDouble("monthlyCarPayment"));
            user.setMonthlyGas(resultSet.getDouble("monthlyGas"));
            user.setMonthlyCellPhone(resultSet.getDouble("monthlyCellPhone"));
            user.setMonthlyTV(resultSet.getDouble("monthlyTV"));
            user.setMonthlyCostTravel(resultSet.getDouble("monthlyCostTravel"));
            user.setMonthlySavings(resultSet.getDouble("monthlySavings"));
        }
        close();
        return user; //if user.getID = null, return null. Otherwise, return user
    }

}
