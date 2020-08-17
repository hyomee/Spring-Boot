package co.kr.abacus.spring.filterInterception.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
	
	Logger logger = LoggerFactory.getLogger(SomeController.class);
	
	@GetMapping("/some")
	public String someController() {
		logger.info("***** GetMapping ****** ");
		return "Hello .... ";
	}
	
	
	@GetMapping("/etc")
	public String someEtcController() {
		logger.info("***** GetMapping ****** ");
		return "Hello .... someEtcController ";
	}


}
