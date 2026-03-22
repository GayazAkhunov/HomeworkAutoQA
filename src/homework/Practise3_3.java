package homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practise3_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int size = scanner.nextInt();


        double[] masDouble = new double[size];
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = random.nextDouble() * 10;
        }

        System.out.println(Arrays.toString(masDouble));

        for (int i = 0; i < masDouble.length; i++) {
            if (i % 2 == 0) {
                masDouble[i] = masDouble[i] * masDouble[i];
            }
        }
        System.out.println(Arrays.toString(masDouble));
    }

}