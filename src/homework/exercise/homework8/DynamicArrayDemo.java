package homework.exercise.homework8;

public class DynamicArrayDemo {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(8);
        dynamicArray.add(9);
        dynamicArray.add(10);
        dynamicArray.add(11);
        dynamicArray.add(12);
        dynamicArray.add(13);
        dynamicArray.add(14);
        dynamicArray.add(15);
        dynamicArray.add(16);
        dynamicArray.add(17);
        dynamicArray.add(18);
        dynamicArray.add(19);
        dynamicArray.add(20);

        dynamicArray.print();

        int byIndex = dynamicArray.getByIndex(5);
        System.out.println("\n" + byIndex);

        byIndex = dynamicArray.getByIndex(31);

        System.out.println(byIndex);

    }
}
