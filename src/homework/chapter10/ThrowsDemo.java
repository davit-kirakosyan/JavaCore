package homework.chapter10;

public class ThrowsDemo {

    static void trowOne()throws IllegalAccessException{
        System.out.println("B теле метода throwOne() .");
        throw new IllegalAccessException("дeмoнcтpaция");
    }
    public static void main(String[] args) {
        try {
            trowOne();
        }catch (IllegalAccessException e){
            System.err.println("Пoвтopный перехват: " + e);
        }
    }
}
