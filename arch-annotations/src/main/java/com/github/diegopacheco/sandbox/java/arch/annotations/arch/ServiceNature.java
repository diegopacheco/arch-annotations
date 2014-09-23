package com.github.diegopacheco.sandbox.java.arch.annotations.arch;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Nature describes a nature of a SOA/API/Service that could be local/remote, java or soap/rest, etc.. whatever. 
 * 
 * @author Diego Pacheco
 * @since 23/09/2014
 * @version 1.0
 *
 */
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface ServiceNature {
	
	Bound bound();
	Profile profile();
	Architecture main_architecture();
	
}
