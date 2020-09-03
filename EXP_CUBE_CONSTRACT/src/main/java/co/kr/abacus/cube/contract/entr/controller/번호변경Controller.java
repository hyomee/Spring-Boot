package co.kr.abacus.cube.contract.entr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import co.kr.abacus.cube.contract.entr.번호변경.service.번호변경서비스;

@RestController
public class 번호변경Controller {
	
	@Autowired
	private 번호변경서비스 번호변경서비스;
	
	public void 번호변경횟수조회() {
		번호변경서비스.번호변경횟수조회();
	}

}
