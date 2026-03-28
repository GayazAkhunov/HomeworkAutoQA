package homework;

import java.util.Arrays;
import java.util.Random;

public class Practise3_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(6);
        }
        System.out.println(Arrays.toString(numbers));
        for (int number : numbers) {
            number = number * number;
            System.out.print(" " + number);
        }
    }
}