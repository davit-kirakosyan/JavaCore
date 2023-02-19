package homework.chapter10;

public class SuperSubCatch {

    public static void main(String[] args) {

        try {
            int a = 0;
            int b = 40 / a;
        }catch (Exception e){
            System.err.println("Перехват исключений общего класса Exception.");
        }
//        catch (ArithmeticException e){
//            System.out.println("Этoт код вообще недостижим.");
//        }
    }
}
