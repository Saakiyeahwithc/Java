public class Account {
    public static void main(String[] args) {
        Account1 acc = new Account1();
        acc.display_balance();
        acc.deposit(1000);
        acc.display_balance();
        acc.deposit(-1000);
    }
}
