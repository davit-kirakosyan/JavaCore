package homework.exercise.homework12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionExample1 {

    private static Scanner scanner = new Scanner(System.in);
    private static List<String> list = new ArrayList<>(
            List.of("poxos", "petros", "martiros", "zmruxt", "valod", "mamikon"));

    private static void search(String name) {
        if (list.contains(name)) {
            System.out.println("there is a cheeky name");
        } else {
            System.out.println("there isn't cheeky name");
        }
    }

    private static void print() {
        for (String name : list) {
            System.out.print(name + " ");
        }
    }

    private static void delete(String name) {
        list.remove(name);
        print();
        System.out.println();
    }

    private static void indexByValue(int index, String name) {
        list.add(index, name);
        print();
        System.out.println();
    }

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input exit for 0");
            System.out.println("Please input is name 1");
            System.out.println("Please input delete 2");
            System.out.println("Please input index by name 3");
            String command = scanner.nextLine();
            switch (command){
                case "0":
                isRun = false;
                break;
                case "1":
                    System.out.println("Name");
                    String search = scanner.nextLine();
                    search(search);
                break;
                case "2":
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    delete(name);
                break;
                case "3":
                    System.out.println("index");
                    int index = Integer.parseInt(scanner.nextLine());
                    System.out.println("name");
                    String name1 = scanner.nextLine();
                    indexByValue(index, name1);
                break;
                default:
                    System.out.println("Wrong command please try again");
            }
        }
    }
}
