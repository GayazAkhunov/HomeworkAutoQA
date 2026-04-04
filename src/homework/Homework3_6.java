package homework;


import java.util.Random;
import java.util.Scanner;

public class Homework3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        Random random = new Random();
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        boolean flag = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Массив возрастает");
        } else {
            System.out.println("Массив не возрастает");
        }
    }
}