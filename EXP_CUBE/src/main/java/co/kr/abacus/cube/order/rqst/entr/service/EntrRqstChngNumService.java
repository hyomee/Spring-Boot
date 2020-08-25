package co.kr.abacus.cube.order.rqst.entr.service;

import co.kr.abacus.cube.order.rqst.entr.dto.EntrRqstOrderDTO;

public interface EntrRqstChngNumService {
	// 모바일 번호 변경 
	public void saveEntrRqstChngNum(EntrRqstOrderDTO entrOrderDTO) ;
}
