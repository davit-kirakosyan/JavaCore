package homework.exercise.homework12.collectionExample1;

import java.util.Scanner;

public class CollectionExample1 implements Commands1 {

    private static Scanner scanner = new Scanner(System.in);
   private static CollectionStorage1 storage = new CollectionStorage1();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands1.print();
            String command = scanner.nextLine();
            switch (command){
                case EXIT:
                isRun = false;
                break;
                case IS_NAME:
                    System.out.println("Name");
                    String search = scanner.nextLine();
                    storage.isName(search);
                break;
                case DELETE_BY_VALUE:
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    storage.delete(name);
                break;
                case ADD_INDEX_BY_NAME:
                    try {
                        System.out.println("index");
                        int index = Integer.parseInt(scanner.nextLine());
                        System.out.println("name");
                        String name1 = scanner.nextLine();
                        storage.indexByValue(index, name1);
                    }catch (NumberFormatException e){
                        System.err.println(e.getMessage());
                    }
                break;
                default:
                    System.out.println("Wrong command please try again");
            }
        }
    }
}
