package sample.spring.aop.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SimpleEventService implements EventService {

	@Override
	public void createEvent() {
		
		try {
			Thread.sleep(1 *1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("event created...");
		
	}

	@Override
	public void publishEvent() {
		
		try {
			Thread.sleep(1 *1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("event published...");

	}

	@Override
	public void deleteEvent() {

		log.info("event deleted...");
		
	}

}
