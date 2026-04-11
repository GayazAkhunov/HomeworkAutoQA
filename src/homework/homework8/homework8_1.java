package homework.homework8;

import java.util.Scanner;

public class homework8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String s1 = scanner.nextLine();

        System.out.println("Введите вторую строку:");
        String s2 = scanner.nextLine();

        System.out.println("Введите третью строку:");
        String s3 = scanner.nextLine();

        String shortest = s1;
        String longest = s1;

        if (s2.length() < shortest.length()) shortest = s2;
        if (s3.length() < shortest.length()) shortest = s3;

        if (s2.length() > longest.length()) longest = s2;
        if (s3.length() > longest.length()) longest = s3;

        System.out.println("Самая короткая строка: " + shortest + ", длина: " + shortest.length());
        System.out.println("Самая длинная строка: " + longest + ", длина: " + longest.length());

    }
}