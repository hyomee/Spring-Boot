package co.kr.abacus.spring.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class ExpPropertiesApplication {
	
	@Value("${user.value}")
	private String value;
	
	@Value("${user.value1}")
	private String value1;
	

	public static void main(String[] args) {
		SpringApplication.run(ExpPropertiesApplication.class, args);
	}
	
	@Bean
	public ApplicationRunner StringSVC() {
		return args -> {
			System.out.println("value :: " + this.value);
			System.out.println("value1 :: " + this.value1);	
		};
	}

}
