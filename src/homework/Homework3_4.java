package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        Random random = new Random();
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(300);
        }
        System.out.println(Arrays.toString(numbers));
        for (int i : numbers) {
            if (i == 0) count++;
        }
        if (count > 0) {
            System.out.println("Количество нулей: " + count);
        } else {
            System.out.println("Нулей нет");
        }
    }
}