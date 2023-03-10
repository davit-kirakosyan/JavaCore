package homework.exercise.homework12;

import java.util.*;

public class CollectionExample2 {

    private static Scanner scanner = new Scanner(System.in);
    private static Set<String> set1 = new HashSet<>();
    private static Set<String> set2 = new TreeSet<>();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input exit for 0");
            System.out.println("Please input add count 1");
            System.out.println("Please input add sort 2");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input add count");
                    int count = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < count; i++) {
                        System.out.println("Please input add");
                        String name = scanner.nextLine();
                        set1.add(name);
                    }
                    for (String name : set1) {
                        System.out.print(name + " ");
                    }
                    System.out.println();
                    break;
                case "2":
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Please input add");
                        String name = scanner.nextLine();
                        set2.add(name);
                    }
                    for (String name : set2) {
                        System.out.print(name + " ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Wrong command please try again");

            }
        }
    }
}
