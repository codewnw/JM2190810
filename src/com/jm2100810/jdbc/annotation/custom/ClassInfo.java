package com.jm2100810.jdbc.annotation.custom;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInfo {
	String author() default "Atul";

	String createdOn() default "2019";

	String[] reviewedBy() default { "Bob" };

	int version() default 1;

	String updatedOn() default "2019";
}
