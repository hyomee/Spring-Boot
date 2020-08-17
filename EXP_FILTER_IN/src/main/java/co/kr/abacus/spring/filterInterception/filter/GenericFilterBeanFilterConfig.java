package co.kr.abacus.spring.filterInterception.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GenericFilterBeanFilterConfig {
	
	@Bean
	public GenericFilterBeanFlter GenericFilterBeanFlte() {
		return new GenericFilterBeanFlter();
	}
}
