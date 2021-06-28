package sample.spring.aop.aspect;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sample.spring.aop.service.AnnotationEventService;

@SpringBootTest
class AnnotationAspectTest {

	@Autowired
	private AnnotationEventService eventService;
	
	@Test
	void testLogEventTime() {
		
		eventService.createEvent();
		eventService.publishEvent();
		eventService.deleteEvent();
		
	}

}
