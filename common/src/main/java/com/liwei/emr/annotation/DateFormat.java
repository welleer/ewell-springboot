package com.liwei.emr.annotation;


import com.liwei.emr.utils.DateUtil;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能说明: 日期格式，用于日期格式字段格式化输出<br>
 * 系统版本: v1.0<br>
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DateFormat {

	public String value() default DateUtil.DATE_FORMAT;
}
