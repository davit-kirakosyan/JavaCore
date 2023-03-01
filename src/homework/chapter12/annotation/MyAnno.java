package homework.chapter12.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
public @interface MyAnno {

    String str() default "Тестирование";
    int val() default  9000;
}
