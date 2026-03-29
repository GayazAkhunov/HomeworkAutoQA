package homework.homework_4.creditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("0001", 1000);
        CreditCard card2 = new CreditCard("0002", 2000);
        CreditCard card3 = new CreditCard("0003", 3000);

        card1.deposit(400);
        card2.deposit(500);
        card3.withdrawal(100);

        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}