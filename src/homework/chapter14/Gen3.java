package homework.chapter14;

public class Gen3<T> extends NonGen2 {
    T ob;

    Gen3(T o, int i) {
        super(i);
        ob = o;
    }

    public T getOb() {
        return ob;
    }
}
