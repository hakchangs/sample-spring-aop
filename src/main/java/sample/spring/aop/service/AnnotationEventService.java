package sample.spring.aop.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import sample.spring.aop.aspect.annotation.LogDuration;

@Service
@Slf4j
public class AnnotationEventService implements EventService {
	
	@LogDuration
	@Override
	public void createEvent() {
		
		try {
			Thread.sleep(1 *1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("event created...");
		
	}

	@LogDuration
	@Override
	public void publishEvent() {
		
		try {
			Thread.sleep(1 *1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("event published...");

	}

	//여기선 로그 생략: AOP 미적용
	@Override
	public void deleteEvent() {

		log.info("event deleted...");
		
	}

}
