package homework.chapter7;

public class VarArgs4 {

    static void vaTest(int... v) {
        System.out.print("Number of arguments: " + v.length + " Content: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ... ) Number of arguments: " + v.length + " Content: ");

        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest(1, 2, 3);
        vaTest(true, false, false);
//        vaTest();
    }
}
