package homework.figure;

class Rectangle extends Figure {private double width, height;
public Rectangle (double width, double height){
    this.height = height;
    this.width = width;
}
    @Override
    double area() {
        return height * width;
    }
    @Override
    double perimeter(){
        return 2 * (width + height);
    }

}
