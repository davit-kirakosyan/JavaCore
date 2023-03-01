package homework.chapter12.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {

    int value();
}
