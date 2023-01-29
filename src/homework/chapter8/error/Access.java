package homework.chapter8.error;

public class Access {

    public static void main(String[] args) {
        B subOb = new B();
        subOb.setIJ(10, 12);
        subOb.sum();
        System.out.println("subOB = " + subOb.total);
    }
}
