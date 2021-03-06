package com.liwei.emr.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能说明: xml解析器注解<br>
 * 系统版本: v1.0<br>
 */
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
public @interface XmlResolver {

    /**
     * 解析器的名称
     * @return
     */
    String value();


}
