class BankAccount {
    private int balance = 1000;

    void deposit(int amount) {
        balance = balance + amount;
    }

    void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(500);
        account.showBalance();
    }
}