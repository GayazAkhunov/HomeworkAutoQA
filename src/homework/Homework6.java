package homework;

public class Homework6 {
    public void method1() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Элемент с индексом 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс вне границ массива.");
        }
    }


    public void method2() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль.");
        } catch (Exception e) {
            System.out.println("Другая ошибка: " + e.getMessage());
        }
    }


    public void method3() {
        try {
            Object obj = "строка";
            Integer num = (Integer) obj;
        } catch (ClassCastException | NullPointerException e) {
            System.out.println("Ошибка приведения типов или null-указатель.");
        }
    }


    public void method4() {
        try {
            int[] arr = {1, 2};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс вне границ массива.");
        } finally {
            System.out.println("Блок finally всегда выполняется.");
        }
    }

    public static void main(String[] args) {
        Homework6 demo = new Homework6();

        System.out.println("Метод 1: ");
        demo.method1();

        System.out.println("Метод 2: ");
        demo.method2();

        System.out.println("Метод 3: ");
        demo.method3();

        System.out.println("Метод 4: ");
        demo.method4();
    }
}