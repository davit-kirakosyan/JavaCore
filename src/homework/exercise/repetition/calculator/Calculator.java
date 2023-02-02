package homework.exercise.repetition.calculator;

public class Calculator {

    private double vol;

    public double plus(double a, double b) {
        return vol = a + b;
    }

    public double minus(double a, double b) {
        return vol = a - b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.print("not divide: ");
            return b;
        }
            return vol = a / b;
    }

    public double multiply(double a, double b) {
        return vol = a * b;
    }
}
