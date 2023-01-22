package homework.chapter7;

public class InnerClassDemo {

    public static void main(String[] args) {

        System.out.println("Outer 1");
        Outer outer = new Outer();
        outer.test();

        System.out.println("Outer 2");
        Outer2 outer2 = new Outer2();
        outer2.test();
    }
}
