package homework.homework8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class homework8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите строку " + (i + 1) + ":");
            strings[i] = scanner.nextLine();
        }
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        System.out.println("Строки в порядке возрастания длины:");
        for (String s : strings) {
            System.out.println(s + " (длина: " + s.length() + ")");
        }
    }
}