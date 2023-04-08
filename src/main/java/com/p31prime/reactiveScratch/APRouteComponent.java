package com.p31prime.reactiveScratch;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Documented
@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface APRouteComponent {

    @AliasFor(annotation = Component.class)
    String value() default "";



}


