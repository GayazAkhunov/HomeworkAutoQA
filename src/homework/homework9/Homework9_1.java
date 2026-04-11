package homework.homework9;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через запятую и пробел: ");
        String input = scanner.nextLine();

        String[] parts = input.split(", ");
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (String part : parts) {
            uniqueNumbers.add(Integer.parseInt(part));
        }

        StringBuilder result = new StringBuilder();
        for (Integer num : uniqueNumbers) {
            if (result.length() > 0) result.append(", ");
            result.append(num);
        }

        System.out.println("Результат: " + result);
    }
}