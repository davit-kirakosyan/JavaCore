package homework.chapter12.annotation.target;

public class TypeAnnoDemo<@What(description = "Данные обобщенного типа") T> {

    public @Unique TypeAnnoDemo() {

    }

    @TypeAnno String str;

    @EmptyOK
    String test;

    public int f(@TypeAnno TypeAnnoDemo<T>this, int x) {
        return 10;
    }

    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    public @Recommended Integer f3(String str) {
        return str.length();
    }

    public void f4() throws @TypeAnno NullPointerException {

    }

    String @MaxLen(10) [] @NotZeroLen [] w;

    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {

        TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();

        TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();

        Object x  = new Integer(10);
        Integer y;


    }

    public static void main(String[] args) {
        myMeth(10);
    }

    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean>{}
}
