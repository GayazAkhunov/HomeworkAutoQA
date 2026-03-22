package homework;

import java.util.Scanner;

public class Homework2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число :");
        int a = scanner.nextInt();
        if ((a % 2) > 0) {
            System.out.println("Нечетно");
        } else {
            System.out.println("Четно");
        }
    }
}
