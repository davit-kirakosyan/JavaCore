package homework.chapter12.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {

    @MyAnno(str = "Первая аннотация", val = -1)
    @MyAnno(str = "Вторая аннотация", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();
        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);

            System.out.println(anno);
        } catch (NoSuchMethodException e) {
            System.err.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
