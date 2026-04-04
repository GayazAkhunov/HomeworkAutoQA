package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        Random random = new Random();
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(numbers));
        int min = numbers[0], max = numbers[0];
        int imin = 0;
        int imax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                imin = i;
            } else if (numbers[i] > max) {
                max = numbers[i];
                imax = i;
            }
        }
        System.out.println("Индекс минимального элемента : " + imin + " значение - " + min);
        System.out.println("Индекс максимального элемента : " + imax + " значение - " + max);
    }
}