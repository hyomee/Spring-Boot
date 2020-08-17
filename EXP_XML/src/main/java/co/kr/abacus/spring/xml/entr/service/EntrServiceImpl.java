package co.kr.abacus.spring.xml.entr.service;

import co.kr.abacus.spring.xml.entrsvc.service.EntrBySvcService;

public class EntrServiceImpl implements EntrService {

	private EntrBySvcService entrBySvcServcie;
	
	public EntrServiceImpl(EntrBySvcService entrBySvcServcie) {
		this.entrBySvcServcie = entrBySvcServcie;
	}
	
	@Override
	public void entrSvc() {		
		System.out.println("가입 서비스");
		entrBySvcServcie.entrBySvc();
	}
}
