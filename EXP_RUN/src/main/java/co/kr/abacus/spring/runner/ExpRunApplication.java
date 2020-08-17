package co.kr.abacus.spring.runner;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import co.kr.abacus.spring.runner.service.ServiceSVC;

@SpringBootApplication
public class ExpRunApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpRunApplication.class, args);
	}
	
	@Bean
	public ApplicationRunner StringSVC(ServiceSVC serviceSVC) {
		return args -> {
			System.out.println(serviceSVC.StringSVC("Hello"));		
		};
	}

}
