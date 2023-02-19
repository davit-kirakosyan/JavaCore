package homework.chapter10;

public class NestTry {

    public static void main(String[] args) {

        try {
            int a = args.length;
            int b = 40 / a;

            System.out.println("a = " + a);

            try {
                if (a == 1) {
                    a = a / (a - a);
                }
                if (a == 2) {
                    int[] c = {1};
                    c[42] = 99;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Индeкc за пределами массива: " + e);
            }
        }catch (ArithmeticException e){
            System.err.println("Дeлeниe на нуль: " + e);
        }
    }
}
