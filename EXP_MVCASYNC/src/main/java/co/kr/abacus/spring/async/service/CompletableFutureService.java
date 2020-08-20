package co.kr.abacus.spring.async.service;

import java.util.concurrent.CompletableFuture;

public interface CompletableFutureService {
	
	public CompletableFuture<String> completableFuturesupplyasync();
	public CompletableFuture<Void> completableFuturerunasync();
	
	
	public CompletableFuture<String> completableFuturesupplyasyncmulti();
	
	public CompletableFuture<Void> completableFuturesupplyasyncmultireturn();
	
	public Iterable<Product> findAll();
	

}
