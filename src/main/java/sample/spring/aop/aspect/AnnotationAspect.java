package sample.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class AnnotationAspect {
	
	//
	// Annotation(@) 기준으로 AOP 를 적용한다.
	//

	@Around("@annotation(sample.spring.aop.aspect.annotation.LogDuration)")
	public Object logEventTime(ProceedingJoinPoint pjp) throws Throwable {
		
		//Before
		long start = System.currentTimeMillis();
		
		//실제 메서드 수행
		Object returnValue = pjp.proceed();
		
		//After
		long duration = System.currentTimeMillis() - start;
		log.info("duration={}", duration);
		
		return returnValue;
	}
	
}
