package sample.spring.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import sample.spring.aop.service.EventService;
import sample.spring.aop.service.SimpleEventService;

@SpringBootApplication
public class SampleSpringAopApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext appCtx = SpringApplication.run(SampleSpringAopApplication.class, args);
		
		//after bean-setup
//		EventService eventService = appCtx.getBean(SimpleEventService.class);
//		
//		eventService.createEvent();
//		eventService.publishEvent();
//		eventService.deleteEvent();
		
	}

}
