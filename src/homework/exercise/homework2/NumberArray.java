package homework.exercise.homework2;

import java.io.UnsupportedEncodingException;

public class NumberArray {

    public static void main(String[] args) throws UnsupportedEncodingException {


//        ունինք թվերի մասիվ, գրել ծրագիր որը կտպի էն էլեմենտները որոնք զրո չեն,
//        օրինակ {1,2,3,0,14,0,56} մասիվի համար պտի տպի 1 2 3 14 56

        int[] numbers = {1, 2, 3, 0, 14, 0, 56};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                System.out.print(numbers[i] + " ");
            }
        }

    }
}
