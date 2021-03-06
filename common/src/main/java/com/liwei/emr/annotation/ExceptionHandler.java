package com.liwei.emr.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能说明: <br>
 * 系统版本: v1.0<br>
 */
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExceptionHandler {

    /**
     * 异常处理器名称
     * @return
     */
    String value();

}
