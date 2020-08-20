package co.kr.abacus.spring.async.controller;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import co.kr.abacus.spring.async.service.Product;
import co.kr.abacus.spring.async.service.ProductService;

@RestController
public class EmitterController {
	
	Logger logger = LoggerFactory.getLogger(EmitterController.class);
	
	@Autowired
	private ProductService productService;
	
	
	
	@GetMapping(value = "/products")
	public ResponseBodyEmitter products() {
		ResponseBodyEmitter emmitter = new ResponseBodyEmitter();
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(()-> {
			Iterable<Product> products = productService.findAll();
			try {
				for ( Product product : products) {
					logger.info(product.toString());
					delay();
					emmitter.send(product);
				}
				emmitter.complete();
			} catch (IOException e) {
				emmitter.completeWithError(e);
			}
		});
		executor.shutdown();
		return emmitter;
	}
	
	
	@GetMapping(value = "/productsSse")
	public ResponseBodyEmitter productsSse() {
		SseEmitter emmitter = new SseEmitter();
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(()-> {
			Iterable<Product> products = productService.findAll();
			try {
				for ( Product product : products) {
					logger.info(product.toString());
					delay();
					emmitter.send(product);
				}
				emmitter.complete();
			} catch (IOException e) {
				emmitter.completeWithError(e);
			}
		});
		executor.shutdown();
		return emmitter;
	}
	private void delay() {
		try {
			
			Thread.sleep(ThreadLocalRandom.current().nextInt(150));
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
