package co.kr.abacus.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import co.kr.abacus.spring.aop.entr.service.EntrService;
import co.kr.abacus.spring.aop.entrsvc.service.EntrBySvcService;

@Component
public class ExpAopRunner implements ApplicationRunner {

	@Autowired
	private EntrBySvcService entrBySvcService;
	
	@Autowired
	private EntrService entrService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("*** Spring Autowired *************");
		entrService.entrServcie();
		entrBySvcService.entrBySvc();
	}

}
