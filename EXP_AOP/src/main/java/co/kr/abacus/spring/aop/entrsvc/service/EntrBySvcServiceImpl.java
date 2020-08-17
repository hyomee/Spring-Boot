package co.kr.abacus.spring.aop.entrsvc.service;

import org.springframework.stereotype.Component;

@Component
public class EntrBySvcServiceImpl implements EntrBySvcService {
	
	@Override
	public void entrBySvc() {
		System.out.println("상품 서비스");		
	}
	
}
