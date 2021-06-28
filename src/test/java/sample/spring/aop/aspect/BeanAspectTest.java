package sample.spring.aop.aspect;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sample.spring.aop.service.BeanEventService;

@SpringBootTest
class BeanAspectTest {

	@Autowired
	private BeanEventService eventService;
	
	@Test
	void testLogEventTime() {
		
		eventService.createEvent();
		eventService.publishEvent();
		eventService.deleteEvent();
		
	}

}
