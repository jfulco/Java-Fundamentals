package capstone;

public class Debt {
    String lenderName;
    double totalOwed;
    int paymentDue;
    double interestRate;
    User user;


    public Debt() {
    }

    public Debt(String lenderName, double totalOwed, int paymentDue, double interestRate, User user) {
        this.lenderName = lenderName;
        this.totalOwed = totalOwed;
        this.paymentDue = paymentDue;
        this.interestRate = interestRate;
        this.user = user;
    }

    public String getLenderName() {
        return lenderName;
    }

    public void setLenderName(String lenderName) {
        this.lenderName = lenderName;
    }

    public double getTotalOwed() {
        return totalOwed;
    }

    public void setTotalOwed(double totalOwed) {
        this.totalOwed = totalOwed;
    }

    public int getPaymentDue() {
        return paymentDue;
    }

    public void setPaymentDue(int paymentDue) {
        this.paymentDue = paymentDue;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Debt{" +
                "lenderName='" + lenderName + '\'' +
                ", totalOwed=" + totalOwed +
                ", paymentDue=" + paymentDue +
                ", interestRate=" + interestRate +
                ", user=" + user +
                '}';
    }
}
