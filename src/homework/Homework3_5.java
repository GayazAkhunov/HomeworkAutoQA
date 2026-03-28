package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        Random random = new Random();
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int mem;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));
        for (int a = 0; a < numbers.length / 2; a++) {
            mem = numbers[a];
            numbers[a] = numbers[numbers.length - 1 - a];
            numbers[numbers.length - 1 - a] = mem;
        }
        System.out.println(Arrays.toString(numbers));
    }
}