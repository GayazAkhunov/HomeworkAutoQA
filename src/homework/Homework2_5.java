package homework;

import java.util.Scanner;

public class Homework2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();//"до введенного пользователем числа", значит введенное число не должно входить в сумму?
        if (a > 0) {
            if (a % 1 == 0) {
                int sum = 0;
                for (int i = 1; i < a; i++) {
                    sum = sum + i;
                }
                System.out.println(sum);
            } else {
                System.out.println("Введите целое положительное число");
            }
        } else {
            {
                System.out.println("Введите целое положительное число");
            }
        }

    }
}