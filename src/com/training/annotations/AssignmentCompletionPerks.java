package com.training.annotations;

import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Inherited
@Documented
@Retention(CLASS)
@Target(LOCAL_VARIABLE)
@Repeatable(value=AllAssignmentPerks.class)
//marker annotations do not have attributes

public @interface AssignmentCompletionPerks {

	String[] perks();
	 Size size() default Size.MEDIUM;
	public static final int MAX_DAYS = 4;
	
}

enum Size{SMALL ,MEDIUM ,LARGE}