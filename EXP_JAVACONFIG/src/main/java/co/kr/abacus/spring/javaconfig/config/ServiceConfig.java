package co.kr.abacus.spring.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.kr.abacus.spring.javaconfig.entr.service.EntrService;
import co.kr.abacus.spring.javaconfig.entr.service.EntrServiceImpl;
import co.kr.abacus.spring.javaconfig.entrsvc.service.EntrBySvcService;
import co.kr.abacus.spring.javaconfig.entrsvc.service.EntrBySvcServiceImpl;

@Configuration
public class ServiceConfig {

	@Bean
	public EntrService entrService() {
		return new EntrServiceImpl(entrBySvcService());
	}
	
	@Bean
	public EntrBySvcService entrBySvcService() {
		return new EntrBySvcServiceImpl();
	}
}
