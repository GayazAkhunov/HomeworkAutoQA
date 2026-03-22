package homework;

import java.util.Arrays;

public class Practise3_2 {
    public static void main(String[] args) {
        String[] fruits = {"Banana", "Apple", "Peach", "Melon"};
        System.out.println(fruits[1] + ", " + fruits[3]);
        System.out.println(fruits.length);
        fruits[2] = "Orange";
        System.out.println(Arrays.toString(fruits));
    }
}