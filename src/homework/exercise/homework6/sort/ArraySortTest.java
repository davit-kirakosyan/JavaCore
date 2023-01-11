package homework.exercise.homework6.sort;

public class ArraySortTest {

    public static void main(String[] args) {

        ArraySort arraySort = new ArraySort();
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        System.out.print("Max: ");
        arraySort.arraySortByMax(numbers);
        arraySort.arrayPrint(numbers);
        System.out.print("\nMin: ");
        arraySort.arraySortByMin(numbers);
        arraySort.arrayPrint(numbers);

    }
}
