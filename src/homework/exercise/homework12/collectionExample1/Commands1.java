package homework.exercise.homework12.collectionExample1;

public interface Commands1 {

    String EXIT = "0";
    String IS_NAME = "1";
    String DELETE_BY_VALUE = "2";
    String ADD_INDEX_BY_NAME = "3";

    static void print(){
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + IS_NAME + " for IS_NAME");
        System.out.println("Please input " + DELETE_BY_VALUE + " for DELETE_BY_VALUE");
        System.out.println("Please input " + ADD_INDEX_BY_NAME + " for ADD_INDEX_BY_NAME");
    }
}
