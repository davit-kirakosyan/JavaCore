package homework.exercise.homework8;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 1; i <= 20; i++) {
            dynamicArray.add(i);
        }

        dynamicArray.print();

        int byIndex = dynamicArray.getByIndex(5);
        System.out.println(byIndex);

        byIndex = dynamicArray.getByIndex(31);

        System.out.println(byIndex);

        dynamicArray.deleteByIndex(5);

        dynamicArray.deleteByIndex(17);

        dynamicArray.print();

        dynamicArray.set(2, 5);
        dynamicArray.set(5, 5);
        dynamicArray.set(21, 5);
        dynamicArray.print();

        dynamicArray.add(3,50);

        dynamicArray.print();

        boolean exists = dynamicArray.exists(18);
        System.out.println(exists);

        int indexByValue = dynamicArray.getIndexByValue(5);
        System.out.println(indexByValue);
    }
}
