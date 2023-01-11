package homework.exercise.homework6.arrayUtil;

public class ArrayUtilTest {


    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        arrayUtil.printArray(array);
        int max = arrayUtil.maxByArray(array);
        System.out.println("\nMax: " + max);
        int min = arrayUtil.minByArray(array);
        System.out.println("Min: " + min);
        arrayUtil.evenToArray(array);
        System.out.println();
        arrayUtil.oddToArray(array);
        System.out.println();
        int evenCount = arrayUtil.evenCountByArray(array);
        System.out.println("even count: " + evenCount);
        int oddCount = arrayUtil.oddCountByArray(array);
        System.out.println("odd count: " + oddCount);
        int sum = arrayUtil.sumByArray(array);
        System.out.println("Sum: " + sum);
        System.out.println("the arithmetic mean of all the numbers in the array: " + (sum / array.length));
        System.out.println("Array first to elements: " + array[0]);
        System.out.println("Array last to elements: " + array[array.length - 1]);
        System.out.println("Array middle to elements: " + array[array.length / 2]);


    }
}
