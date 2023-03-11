package homework.exercise.homework12.collectionExample2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionStorage2 {

    private static Set<String> set1 = new HashSet<>();

    private static Set<String> set2 = new TreeSet<>();

    public void addCountByElement(String name){
        set1.add(name);
    }
    public void addTenElement(String name) {
        set2.add(name);
    }
    public void setOneByPrint(){
        for (String arr : set1) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
    public void setTwoByPrint(){
        for (String arr : set2) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}
