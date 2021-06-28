package sample.spring.aop.aspect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//method 를 대상으로 수행
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface LogDuration {

}
