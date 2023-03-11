package homework.exercise.homework12.collectionExample2;

import java.util.*;

public class CollectionExample2 implements Commands2 {

    private static Scanner scanner = new Scanner(System.in);
    private static CollectionStorage2 storage2 = new CollectionStorage2();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands2.print();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case COUNT_BY_ADD_ARRAY:
                    System.out.println("Please input add count");
                    int count = 0;
                    try {
                        count = Integer.parseInt(scanner.nextLine());
                        for (int i = 1; i <= count; i++) {
                            System.out.println("Please input add");
                            String name = scanner.nextLine();
                            storage2.addCountByElement(name);
                        }
                    } catch (NumberFormatException e) {
                        System.err.println(e.getMessage());
                    }
                    storage2.setOneByPrint();
                    break;
                case ADD_BY_SORT:
                    System.out.println("Please input add");
                    for (int i = 1; i <= 10; i++) {
                        String name = scanner.nextLine();
                        storage2.addTenElement(name);
                        System.out.println("Element: " + i);
                    }
                    storage2.setTwoByPrint();
                    break;
                default:
                    System.out.println("Wrong command please try again");

            }
        }
    }
}
