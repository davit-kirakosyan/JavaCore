package homework.chapter14;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

     T getOb() {
        System.out.print("Meтoд getob() из класса Gen: ");
        return ob;
    }

    void showType(){
        System.out.println("Tипoм Т является " + ob.getClass().getName());
    }
}
