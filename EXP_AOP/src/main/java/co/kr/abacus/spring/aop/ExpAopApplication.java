package co.kr.abacus.spring.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class ExpAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpAopApplication.class, args);
	}

}
