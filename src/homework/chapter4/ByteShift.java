package homework.chapter4;

public class ByteShift {

    public static void main(String[] args) {

        byte a = 64;
        int i;
        i = a << 2;
        byte b = (byte) (a << 2);
        System.out.println("a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
