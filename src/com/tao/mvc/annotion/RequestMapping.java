package com.tao.mvc.annotion;

import java.lang.annotation.*;

/**
 * Created by Taoyongpan on 2017/11/22.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    String value() default "";
}
