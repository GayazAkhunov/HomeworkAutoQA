package homework.figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(3,4,5),
                new Rectangle(2,6),
                new Circle(3),
        };
        double sumPerimeter = 0;
        for(Figure figure: figures){
            sumPerimeter += figure.perimeter();
        }
        System.out.println("Сумма периметров: "+ sumPerimeter);
    }
}