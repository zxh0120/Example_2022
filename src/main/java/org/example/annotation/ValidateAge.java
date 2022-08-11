package org.example.annotation;

import java.lang.annotation.*;

/**
 * @author zxh
 * @date 2022/7/14
 * @description 年龄校验
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Inherited
public @interface ValidateAge {
    /**
     * 最小值
     *
     * @return
     */
    int min() default 18;

    /**
     * 最大值
     *
     * @return
     */
    int max() default 99;

    /**
     * 默认值
     *
     * @return
     */
    int value() default 20;
}
