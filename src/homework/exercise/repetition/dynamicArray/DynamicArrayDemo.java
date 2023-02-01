package homework.exercise.repetition.dynamicArray;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 1; i <= 20; i++) {
            dynamicArray.add(i);
        }
        dynamicArray.print();

        System.out.println(dynamicArray.getByIndex(5));
        dynamicArray.deleteByIndex(5);
        dynamicArray.print();
        dynamicArray.set(5, 77);
        dynamicArray.set(6, 77);
        dynamicArray.print();
        dynamicArray.add(2,18);
        dynamicArray.print();
        System.out.println(dynamicArray.exists(77));
        System.out.println(dynamicArray.getIndexByValue(77));
    }
}
