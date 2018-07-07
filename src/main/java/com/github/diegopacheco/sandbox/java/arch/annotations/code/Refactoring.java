package com.github.diegopacheco.sandbox.java.arch.annotations.code;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Refactoring marks a class or method to be refactored. <BR><BR>
 * 
 * who_found => The developer who found the code to improve. <BR>
 * when => The date where the code was found. <BR>
 * why  => The reason why that code is bad or why is important to change it <BR>
 * todo => What todo to fix this code, how to improve it!?
 * 
 * @author Diego Pacheco
 * @since 23/09/2014
 * @version 1.0
 *
 */
@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface Refactoring {
	
	String who_found();
	String when();
	String why();
	String todo();
	
}
