package homework.atm;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Инициализация банкомата ===");
        ATM myATM = new ATM(10, 5, 3);

        System.out.println("\n=== Попытка снять 370 рублей ===");
        boolean success = myATM.withdrawal(370);
        System.out.println("Операция успешна? " + success);

        System.out.println("\n=== Попытка снять 900 рублей (недостаточно средств) ===");
        success = myATM.withdrawal(900);
        System.out.println("Операция успешна? " + success);

        System.out.println("\n=== Пополнение банкомата ===");
        myATM.addMoney(5, 2, 1);

        System.out.println("\n=== Попытка снять 490 рублей ===");
        success = myATM.withdrawal(490);
        System.out.println("Операция успешна? " + success);

        System.out.println("\n=== Попытка снять 100 рублей ===");
        myATM.withdrawal(100);
    }
}