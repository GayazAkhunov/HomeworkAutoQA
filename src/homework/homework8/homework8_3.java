package homework.homework8;

import java.util.Scanner;

public class homework8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[3];
        int[] lengths = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите строку " + (i + 1) + ":");
            strings[i] = scanner.nextLine();
            lengths[i] = strings[i].length();
        }

        double averageLength = (lengths[0] + lengths[1] + lengths[2]) / 3.0;

        System.out.println("Средняя длина строк: " + averageLength);
        System.out.println("Строки короче средней:");

        for (int i = 0; i < 3; i++) {
            if (lengths[i] < averageLength) {
                System.out.println(strings[i] + " (длина: " + lengths[i] + ")");
            }
        }
    }
}