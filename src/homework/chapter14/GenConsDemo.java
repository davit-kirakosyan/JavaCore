package homework.chapter14;

import homework.chapter14.GenCons;

public class GenConsDemo {

    public static void main(String[] args) {

        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);
        test.showVol();
        test2.showVol();
    }
}
