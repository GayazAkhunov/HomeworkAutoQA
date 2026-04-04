package homework.figure;

class Circle extends Figure {private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return 3.14 * (radius * radius);
    }
    @Override
    double perimeter(){
        return 2 * 3.14 * radius;
    }
}