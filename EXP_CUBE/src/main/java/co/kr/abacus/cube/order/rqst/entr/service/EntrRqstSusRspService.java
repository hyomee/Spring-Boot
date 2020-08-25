package co.kr.abacus.cube.order.rqst.entr.service;

import co.kr.abacus.cube.order.rqst.entr.dto.EntrRqstOrderDTO;

public interface EntrRqstSusRspService {
	
	// 모바일 일시 정지 
	public void saveEntrRqstSus(EntrRqstOrderDTO entrOrderDTO) ;
	
	// 모바일 정지 해제 
	public void saveEntrRqstRsp(EntrRqstOrderDTO entrOrderDTO) ;	
}
