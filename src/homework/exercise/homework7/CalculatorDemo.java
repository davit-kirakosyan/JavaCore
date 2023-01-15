package homework.exercise.homework7;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.plus(3, 5));
        System.out.println(calculator.minus(1,5));
        System.out.println(calculator.multiply(3, 5));
        System.out.println(calculator.divide(9, 0));
    }
}
