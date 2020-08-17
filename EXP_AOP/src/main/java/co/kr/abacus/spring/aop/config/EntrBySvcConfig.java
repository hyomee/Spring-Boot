package co.kr.abacus.spring.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.kr.abacus.spring.aop.aspect.EntrServiceAspect;

@Configuration
public class EntrBySvcConfig {
	
	@Bean
	public EntrServiceAspect entrBySvcBeanAspect() {
		return new EntrServiceAspect();
	}

}
