package co.kr.abacus.cube.order.rqst.svc.service;

import co.kr.abacus.cube.order.rqst.svc.dto.SvcByEntrRqstOrderDTO;

public interface SvcByEntrRqstService {

	// 모바일 상품 변경 
	public void saveSvcByEntrRqst(SvcByEntrRqstOrderDTO svcByEntrRqstOrderDTO);
}
