package com.annotation.init;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.security.PrivateKey;

/**
 * @author hwb
 * @version 1.0
 * @date 2021/6/9 0009 16:08
 */
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Colunm {

    /**
     * 字段名称
     */
    String value() default "123";

    /**
     * 类型
     */
    String type() default "123";

    /**
     * 字符集长度
     */
    int length() default 1;

    /**
     * 精度
     */
    int accuracy() default 0;

}
