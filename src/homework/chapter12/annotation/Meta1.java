package homework.chapter12.annotation;

import java.lang.reflect.Method;

public class Meta1 {
    @MyAnno(str = "Два параметра", val =  19)
    public static void myMeth( String str, int i){

        Meta1 ob = new Meta1();

        try {
            Class<?> c = ob.getClass();


            Method m  = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException e){
            System.err.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {

        myMeth("Test", 10);
    }
}
