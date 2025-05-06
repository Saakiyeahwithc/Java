public class Account1 {
    private double balance = 0;

    public void display_balance() {
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid balance: " + amount);
        }
    }
}
