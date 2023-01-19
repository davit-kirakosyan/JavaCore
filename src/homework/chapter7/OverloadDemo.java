package homework.chapter7;

public class OverloadDemo {

    public static void main(String[] args) {

        Overload overload = new Overload();
        double result;

        overload.test();
        overload.test(10);
        overload.test(10, 20);
        result = overload.test(123.25);

        System.out.println("overload.test(123.25): " + result);
        System.out.println("---------------------------------------");
        Overload2 overload2 = new Overload2();
        int i = 88;

        overload2.test();
        overload2.test(10, 20);
        overload2.test(i);
        overload2.test(123.2);

    }
}
