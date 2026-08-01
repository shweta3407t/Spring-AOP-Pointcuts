package com.example.SpringDTOPointcut.customAnnotation;

import java.lang.annotation.*;


//configured annotation
@Target({ElementType.METHOD ,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface TrackExecutionTime {

    long warnAfter() default 2000;

    String operation() default  "";

}



////marker annotation
//public @interface TrackExecutionTime {
//}
