package homework.exercise.homework12.collectionExample2;

public interface Commands2 {

    String EXIT = "0";
    String COUNT_BY_ADD_ARRAY = "1";
    String ADD_BY_SORT = "2";

    static void print() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + COUNT_BY_ADD_ARRAY + " for COUNT_BY_ADD_ARRAY");
        System.out.println("Please input " + ADD_BY_SORT + " for ADD_BY_SORT");
    }
}
