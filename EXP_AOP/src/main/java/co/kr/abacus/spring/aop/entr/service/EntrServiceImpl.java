package co.kr.abacus.spring.aop.entr.service;

import org.springframework.stereotype.Component;

@Component
public class EntrServiceImpl implements EntrService {
	

	@Override
	public void entrServcie() {
		System.out.println("가입 서비스");
	}

}
