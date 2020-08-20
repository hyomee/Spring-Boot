package co.kr.abacus.spring.async.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class CompletableFutureServiceImpl implements CompletableFutureService {
	
	Logger logger = LoggerFactory.getLogger(CompletableFutureServiceImpl.class);
	
	// TaskExecutor을 재사용 하기 위햐서
	private final TaskExecutor taskexcutor;
	
	public CompletableFutureServiceImpl(TaskExecutor taskexcutor) {
		this.taskexcutor = taskexcutor;
	}
	
	
	
	// 여러 서비스를 비동시로 호출 하고 결과를 취합 해서 리턴
	@Override
	public CompletableFuture<String> completableFuturesupplyasyncmulti() {
		CompletableFuture<String> future_1 = completableFuturesupplyasync();
		CompletableFuture<String> future_2 = completableFuturesupplyasync_2();
		CompletableFuture<String> future_rn = new CompletableFuture<>();		
		
		try {
			future_rn.complete(future_1.get() + ":: " + future_2.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return future_rn;
	}
	
	// 여러 서비스를 비동시로 호출 하고 결과를 취합 해서 리턴
	@Override
	public CompletableFuture<Void> completableFuturesupplyasyncmultireturn() {
		CompletableFuture<String> future_1 = completableFuturesupplyasync();
		CompletableFuture<String> future_2 = completableFuturesupplyasync_2();
		CompletableFuture<Void> future_rn = new CompletableFuture<>();		
		
		/* 주석을 풀면 처리 결과 취합 할 동안 대기 함 
		try {
			future_rn.complete(future_1.get() + ":: " + future_2.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		return future_rn;
	}
	
	// 하나의 서비스를 비동기 호출 하여 결과 응답 
	@Override
	public CompletableFuture<String> completableFuturesupplyasync() {
		logger.info("Service :: CompletableFutureSupplyAsync Start ");
		return CompletableFuture.supplyAsync(()-> {
			delay("Service :: CompletableFuturesupplyasync", 5000);			
			return "Message :: CompletableFutureSupplyAsync";
		}, taskexcutor);		
	}
	
	// 결과가 없는 비동기 실행 
	@Override
	public CompletableFuture<Void> completableFuturerunasync() {
		logger.info("Service :: CompletableFutureRunAsync Start ");
		CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {

			@Override
			public void run() {
				delay("Service :: CompletableFutureRunAsync", 5000);
			}
			
		});
		logger.info("Service :: CompletableFutureRunAsync End ");
		return future;

	}
	
	public CompletableFuture<String> completableFuturesupplyasync_2() {
		logger.info("Service :: CompletableFutureSupplyAsync_2 Start ");
		return CompletableFuture.supplyAsync(()-> {
			delay("Service :: CompletableFutureSupplyAsync_2", 1000);			
			return "Message :: CompletableFutureSupplyAsync_2";
		}, taskexcutor);		
	}
	
	public void delay(String asyncName, int delaytime) {
		try {
			logger.info(asyncName + " Delay " + delaytime + " Start ");
			Thread.sleep(ThreadLocalRandom.current().nextInt(delaytime));
			logger.info(asyncName + " Delay " + delaytime + " End ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private final List<Product> products = new ArrayList<Product>();
	
	@Override
	public Iterable<Product> findAll() {
		return List.copyOf(this.products);
	}
	
	@PostConstruct
	public void init() {
		createProducts();
	}

	

	private List<Product> createProducts() {
		for ( int i = 0; i <30; i++) {
			this.products.add(createProduct(i));
		}
		return products;
	}



	private Product createProduct(int i) {
		return new Product("상품 번호 :: " + i);
	}

	

}
