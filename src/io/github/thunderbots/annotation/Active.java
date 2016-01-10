package io.github.thunderbots.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Determines whether or not the OpMode needs to be sent from 
 * the Robot Controller to the Driver Station
 * 
 * @author Pranav Mathur
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Active {
	
}
