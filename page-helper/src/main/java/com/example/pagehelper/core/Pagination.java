package com.example.pagehelper.core;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Pagination {
    String pageNo() default "pageNo";
    String pageSize() default "pageSize";
}
