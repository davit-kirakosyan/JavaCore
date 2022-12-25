package homework.exercise.homework3;

public class NumberArrayUtil {

    public static void main(String[] args) {

        int[] numbers = {15, 98, 101, 2, 6, 13, 77, 25, 44, 81};

//        Տպեք մասիվի բոլոր զույգ էլեմենտները,
        System.out.print("Even: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
//        Տպեք մասիվի բոլոր կենտ էլեմենտները։
        System.out.print("\nOdd: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
//        Տպեք զույգերի քանակը։
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("\nNumber of even: " + evenCount);
//        Տպեք կենտերի քանակը
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Number of odd: " + oddCount);
//        Տպեք մասիվի էլեմենտների գումարը։
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of array elements։ " + sum);
        //        Տպեք մասիվի բոլոր թվերի միջին թվաբանականը
//        (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        System.out.println("The median of the array: " + (sum / numbers.length));

//        Տպեք մասիվի առաջին էլեմենտը։
        System.out.println("The first element of the array: " + numbers[0]);
//        Տպեք մասիվի վերջին էլեմենտը։
        System.out.println("The last element of the array: " + numbers[numbers.length - 1]);
//        Տպեք մասիվի մեջտեղի էլեմենտը։
        System.out.println("The middle element of the array: "+numbers[numbers.length / 2]);
    }
}
