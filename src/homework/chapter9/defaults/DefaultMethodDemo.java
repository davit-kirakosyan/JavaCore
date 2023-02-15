package homework.chapter9.defaults;

public class DefaultMethodDemo {

    public static void main(String[] args) {

        MyIfImp obj = new MyIfImp();

        System.out.println(obj.getNumber());

        System.out.println(obj.getString());

        MyIfImp2 obj2 = new MyIfImp2();

        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());
    }
}
