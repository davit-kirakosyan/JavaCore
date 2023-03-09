package homework.chapter14;

public class Gen4<T> extends Gen<T> {

    Gen4(T o) {
        super(o);
    }

    T getOb() {
        System.out.print("Meтoд getob() из класса Gen4: ");
        return ob;
    }
}
