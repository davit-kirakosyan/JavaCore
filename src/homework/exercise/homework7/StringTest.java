package homework.exercise.homework7;

import java.util.ArrayList;
import java.util.List;

public class StringTest {

    public static void main(String[] args) {

        String name = "Poxos";
        String surname = new String("'Poxosyan");

        List<Integer> list =new ArrayList<>(15);
        Integer[] integer = new Integer[15];
        System.out.println(integer.length);
        System.out.println(list.size());
        System.out.println(surname.length());

        System.out.println(name.length());
    }
}
