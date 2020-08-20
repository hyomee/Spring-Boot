package co.kr.abacus.spring.async.controller;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AsyncCallableController {
	
	Logger logger = LoggerFactory.getLogger(AsyncCallableController.class);
	
	@GetMapping
	public Callable<String> callable() {
		logger.info("Callable Start");
		return () -> {
			logger.info("Callable Sleep : 5000");
			Thread.sleep(ThreadLocalRandom.current().nextInt(5000));
			return "Callable Return";
		};
	}
}
