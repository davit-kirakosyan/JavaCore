package homework.exercise.homework7.calculator;

public class Calculator {

    double vol;

    public double plus(double a, double b) {
        return vol = b + a;
    }

    public double minus(double a, double b) {
        return vol = a - b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("0 is not divide");
            return -1;
        }
        return vol = a / b;
    }

    public double multiply(double a, double b) {
        return vol = a * b;
    }
}
