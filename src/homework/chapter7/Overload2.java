package homework.chapter7;

public class Overload2 {

    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a & b " + a + " " + b);
    }

    void test(double a) {
        System.out.println("test(double) a = " + a);
    }
}
