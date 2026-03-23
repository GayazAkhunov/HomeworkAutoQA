package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        Random random = new Random();
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        //int[] numbers = new int[] {9, 9, 9}; - проверка работы
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(numbers));
        int carry = 1;
        for (int i = numbers.length - 1; i >= 0 && carry > 0; i--) {
            int sum = numbers[i] + carry;
            numbers[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry > 0) {
            int[] newArray = new int[numbers.length + 1];
            newArray[0] = carry;
            System.arraycopy(numbers, 0, newArray, 1, numbers.length);
            numbers = newArray;
            System.out.println("Новый массив с переносом: ");
            System.out.print(Arrays.toString(numbers));
        } else {
            System.out.println("Новый массив: ");
            System.out.print(Arrays.toString(numbers));
        }
    }
}