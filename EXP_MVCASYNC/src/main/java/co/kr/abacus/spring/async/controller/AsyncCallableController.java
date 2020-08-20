package co.kr.abacus.spring.async.controller;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncCallableController {
	
	@GetMapping
	public Callable<String> callable() {
		return () -> {
			Thread.sleep(ThreadLocalRandom.current().nextInt(5000));
			return "Callable Return";
		};
	}
}
