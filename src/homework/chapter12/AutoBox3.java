package homework.chapter12;

public class AutoBox3 {

    public static void main(String[] args) {

        Integer iOb1, iOb2;
        int i;

        iOb1 = 100;
        System.out.println("Исходное значение iOb1: " + iOb1);

        ++iOb1;
        System.out.println("Пocлe ++iOb: " + iOb1);

        iOb2 = iOb1 + (iOb1 / 3);

        System.out.println("iOb2 после выражения: " + iOb2);

        i = iOb1 + (iOb1 / 3);
        System.out.println("i после выражения: " + i);
    }
}
