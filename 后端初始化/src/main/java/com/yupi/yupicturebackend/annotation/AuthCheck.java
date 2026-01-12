package com.yupi.yupicturebackend.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//注解范围：方法
@Retention(RetentionPolicy.RUNTIME)//注释生效时间：运行时
public @interface AuthCheck {
    /**
     * 必须既有某个角色
     * @return
     */
    String mustRole() default "";
}
