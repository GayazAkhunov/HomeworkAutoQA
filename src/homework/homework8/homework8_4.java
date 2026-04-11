package homework.homework8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class homework8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите строку " + (i + 1) + ":");
            strings[i] = scanner.nextLine();
        }

        String result = null;
        for (String s : strings) {
            if (hasAllUniqueChars(s)) {
                result = s;
                break;
            }
        }

        if (result != null) {
            System.out.println("Первое слово из различных символов: " + result);
        } else {
            System.out.println("Нет слова, состоящего только из различных символов.");
        }

        scanner.close();
    }

    private static boolean hasAllUniqueChars(String s) {
        Set<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        return chars.size() == s.length();
    }
}