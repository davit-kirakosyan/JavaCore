package homework.chapter14;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }
    void showType(){
        System.out.println("Oбъeкт ob относится к типу " + ob.getClass().getName());
    }
}
