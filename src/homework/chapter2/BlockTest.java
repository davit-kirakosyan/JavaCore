package homework.chapter2;

public class BlockTest {

    public static void main(String[] args) {

        int x, y;

        y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println(" x = " + x + ", ");
            System.out.println(" y = " + y + ", ");
            y = y - 2;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
