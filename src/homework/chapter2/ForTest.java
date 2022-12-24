package homework.chapter2;

public class ForTest {

    public static void main(String[] args) {
        int x;

        for (x = 0; x < 10; x = x + 1) {
            System.out.print(" x = " + x + ", ");
        }

        System.out.println();
        for (x = 10; x > 0; x--) {
            System.out.print(" x = " + x +", ");
        }

        System.out.println();
        for (x = 0; x < 10; x++) {
            System.out.print(" x = " + x + ", ");
        }
    }
}
