package homework;

import java.util.Scanner;

public class Homework2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру");
        int t = scanner.nextInt();
        if (t <= -5) {
            if (t > -20) {
                System.out.println("Normal");
            } else {
                System.out.println("Cold");
            }
        } else {
            System.out.println("Warm");
        }
    }
}

