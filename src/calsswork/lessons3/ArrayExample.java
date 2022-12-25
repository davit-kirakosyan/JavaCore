package calsswork.lessons3;

public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = {33, 44, 55, 66, 77};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int[] myArray = new int[10];

        for (int i = 0; i < 10; i++) {
            myArray[i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
