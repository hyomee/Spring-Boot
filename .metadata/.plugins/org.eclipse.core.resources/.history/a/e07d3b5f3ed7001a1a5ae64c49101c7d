package co.kr.abacus.spring.javaconfig.entr.service;

import co.kr.abacus.spring.javaconfig.entrsvc.service.EntrBySvcService;


public class EntrServiceImpl implements EntrService {
	
	@SuppressWarnings("unused")
	private EntrBySvcService entrBySvcServcie;
	
	public EntrServiceImpl(EntrBySvcService entrBySvcServcie) {
		this.entrBySvcServcie = entrBySvcServcie;
	}
	

	@Override
	public void entrServcie() {
		System.out.println("가입 서비스");
		entrBySvcServcie.entrBySvc();
	}

}
