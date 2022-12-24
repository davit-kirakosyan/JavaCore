package homework.chapter3;

import java.io.UnsupportedEncodingException;

public class Promote {

    public static void main(String[] args) throws UnsupportedEncodingException {

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);

        char a = 'ա';
        int x = a;
        System.out.println(x);
    }
}
