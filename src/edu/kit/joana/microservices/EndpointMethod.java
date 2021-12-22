package edu.kit.joana.microservices;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotates an endpoint method (a method that acts as the interface of the underlying server and accepts a service
 * implementation, in every Object typed argument and runs it as a service)
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
@interface EndpointMethod {
}
