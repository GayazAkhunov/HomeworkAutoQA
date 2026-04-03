package homework.homework_4.creditCard;

public class CreditCard {
    String accountNumber;
    double balance;

    public CreditCard(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public void displayInfo() {
        System.out.println("Счёт: " + accountNumber + ", Баланс: " + balance);
    }
}