package homework.exercise.homework12.collectionExample1;

import java.util.ArrayList;
import java.util.List;

public class CollectionStorage1 {

    private  List<String> list = new ArrayList<>(
            List.of("poxos", "petros", "martiros", "zmruxt", "valod", "mamikon"));

    public  void search(String name) {
        if (list.contains(name)) {
            System.out.println("there is a cheeky name");
        } else {
            System.out.println("there isn't cheeky name");
        }
    }

    public void print() {
        for (String name : list) {
            System.out.print(name + " ");
        }
    }

    public  void delete(String name) {
        list.remove(name);
        print();
        System.out.println();
    }

    public  void indexByValue(int index, String name) {
        list.add(index, name);
        print();
        System.out.println();
    }
}
