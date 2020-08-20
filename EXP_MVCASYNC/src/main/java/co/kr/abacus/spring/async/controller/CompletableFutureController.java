package co.kr.abacus.spring.async.controller;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.kr.abacus.spring.async.service.CompletableFutureService;
import co.kr.abacus.spring.async.service.CompletableFutureServiceImpl;

@RestController
public class CompletableFutureController {
	
	Logger logger = LoggerFactory.getLogger(CompletableFutureServiceImpl.class);
	
	@Autowired CompletableFutureService completableFutureService;
	
	// 결과 수행 후 결과를 응답 하기 위해서 CompletableFuture.supplyAsync 사용 
	@GetMapping(value = "/completableFuturesupplyasync")
	public CompletableFuture<String> completableFuturesupplyasync() {
		return completableFutureService.completableFuturesupplyasync();
	}
	
	// 여러 서비스가 비동기 수행 후 취합 하여 결과 응답 
	// 서비스 완료 시점 까지 대기 
	@GetMapping(value = "/completableFuturesupplyasyncmulti")
	public CompletableFuture<String> completableFuturesupplyasyncmulti() {
		return completableFutureService.completableFuturesupplyasyncmulti();
	}
	
	// 여러 서비스가 비동기 수행 후 취합 하여 결과 응답 
	// 서비스 완료 시점 까지 대기 
	@GetMapping(value = "/completableFuturesupplyasyncmultireturn")
	public String completableFuturesupplyasyncmultireturn() throws InterruptedException, ExecutionException {
		completableFutureService.completableFuturesupplyasyncmulti();
		//logger.info(" completableFuturesupplyasyncmultireturn :: " + future.get());
		logger.info(" completableFuturesupplyasyncmultireturn :: ");
		return "Message :: completableFuturesupplyasyncmultireturn";
	}
	
	// 결과 수행 후 결과를 응답 하기 위해서 CompletableFuture.runAsync 사용 
	@GetMapping(value = "/completableFuturerunasync")
	public CompletableFuture<Void> completableFuturerunasync() {
		CompletableFuture<Void> future = completableFutureService.completableFuturerunasync();
		return future; //"Message :: CompletableFuture.RunAsync";
	}
	
	// 결과에 관계 없이 비동기 수행 
	@GetMapping(value = "/completableFuturerunasyncreturn")
	public String completableFuturerunasyncreturn() {
		completableFutureService.completableFuturerunasync();
		return "Message :: CompletableFuture.RunAsync";
	}

}
