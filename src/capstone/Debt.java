package capstone;

public class Debt {
    String lenderName;
    double totalOwed;
    int paymentDue;
    double interestRate;


    public Debt() {
    }

    public Debt(String lenderName, double totalOwed, int paymentDue, double interestRate) {
        this.lenderName = lenderName;
        this.totalOwed = totalOwed;
        this.paymentDue = paymentDue;
        this.interestRate = interestRate;
    }
}
