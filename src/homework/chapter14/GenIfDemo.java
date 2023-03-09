package homework.chapter14;

public class GenIfDemo {

    public static void main(String[] args) {

        Integer[] iNums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iOb = new MyClass<>(iNums);
        MyClass<Character> cOb = new MyClass<>(chs);

        System.out.println("Maкcимaльнoe значение в массиве inums: " + iOb.max());
        System.out.println("Mинимaльнoe значение в массиве inums: " + iOb.min());

        System.out.println("Maкcимaльнoe значение в массиве chs: " + cOb.max());
        System.out.println("Mинимaльнoe значение в массиве chs: " + cOb.min());
    }
}
