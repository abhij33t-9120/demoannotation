package com.training.annotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
//it can be applied to types
public @interface Event {
	
	String spaceTypeNeeded() default  "";
    boolean successful() default true;
     int hours=3;
     
}
