package homework.exercise.homework5;

public class ArraySort {

    public static void main(String[] args) {

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number);
            if (number != numbers[numbers.length - 1]) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number);
            if (number != numbers[numbers.length - 1]) {
                System.out.print(", ");
            }
        }
    }
}
