package co.kr.abacus.spring.runner.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceSVCImpl implements ServiceSVC {

	
	@Override
	public String StringSVC(String str) {
		
		return "INPUT :: " + str;
	}

}
