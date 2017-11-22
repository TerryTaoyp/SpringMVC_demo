package com.tao.mvc.annotion;

import java.lang.annotation.*;

/**
 * Created by Taoyongpan on 2017/11/22.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Controller {
    String value() default "";
}
