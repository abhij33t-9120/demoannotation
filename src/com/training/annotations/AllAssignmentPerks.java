package com.training.annotations;

import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Inherited

@Documented
@Retention(CLASS)
@Target(LOCAL_VARIABLE)
public @interface AllAssignmentPerks {
	
	AssignmentCompletionPerks[] value() default {};
	

}
