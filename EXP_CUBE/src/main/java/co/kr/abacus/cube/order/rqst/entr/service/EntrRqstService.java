package co.kr.abacus.cube.order.rqst.entr.service;

import co.kr.abacus.cube.order.rqst.entr.dto.EntrRqstOrderDTO;

public interface EntrRqstService {
	
	// 모바일 신규 가입 임시 저정 
	public void saveEntrRqstTemp(EntrRqstOrderDTO entrOrderDTO) ;
	
	// 모바일  신규 가입
	public void saveEntrRqst(EntrRqstOrderDTO entrOrderDTO) ;	
	
}
