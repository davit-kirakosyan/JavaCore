package homework.chapter8;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("B области треугольника.");
        return dim1 * dim2 / 2;
    }
}
