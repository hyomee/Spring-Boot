package co.kr.abacus.spring.filterInterception;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExpFilterInApplication {

	public static void main(String[] args) {
		ApplicationContext  ctx = SpringApplication.run(ExpFilterInApplication.class, args);
		
		System.out.println("# Beans : " + ctx.getBeanDefinitionCount());
		
		String[] names = ctx.getBeanDefinitionNames();
		
		Arrays.sort(names);
		Arrays.asList(names).forEach(System.out::println);
	}

}
