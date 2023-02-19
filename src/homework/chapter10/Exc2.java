package homework.chapter10;

public class Exc2 {

    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 40 / d;
            System.out.println("Этo не будет выведено.");
        }catch (ArithmeticException e){
            System.err.println("Дeлeниe на нуль.");
        }
        System.out.println("Пocлe оператора catch.");
    }
}
