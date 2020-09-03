package co.kr.abacus.cube.contract.entr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.kr.abacus.cube.contract.entr.repository.가입이력Repository;
import co.kr.abacus.cube.contract.entr.번호변경.service.번호변경서비스;

@Service
public class 번호변경서비스Impl implements 번호변경서비스 {

	
	@Autowired
	private 가입이력Repository 번호변경저정소Repository;
	
	
	@Override
	public void 번호변경횟수조회() {
		번호변경저정소Repository.번호변경횟수조회();
		
	}

}
