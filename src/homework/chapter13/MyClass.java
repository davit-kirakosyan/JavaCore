package homework.chapter13;

public class MyClass {

    int a;
    int b;

    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    MyClass(int i) {
        this(i, i);
    }

    MyClass() {
        this(0);
    }

    public static void main(String[] args) {

        MyClass myClass = new MyClass(8);
        System.out.println(myClass.a + " " + myClass.b);

        MyClass myClass2 = new MyClass();
        System.out.println(myClass2.a + " " + myClass2.b);
    }
}
