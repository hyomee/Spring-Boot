package co.kr.abacus.cube.order.rqst.entr.dto;

import co.kr.abacus.cube.order.rqst.svc.dto.AsgnDcByNoRqstDTO;
import co.kr.abacus.cube.order.rqst.svc.dto.RqstRsvVarDetlDTO;
import co.kr.abacus.cube.order.rqst.svc.dto.SvcByEntrRqstDTO;
import co.kr.abacus.cube.order.rqst.svc.dto.SvcRqstEtcInfoDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EntrRqstOrderDTO {
		
	// 신청 상태 구분  
	private String entrRqstDvCd;
	
	// 가입 신청 상품 
	private SvcByEntrRqstDTO svcByEntrRqstDTO;
	
	// 지정번호 
	private AsgnDcByNoRqstDTO asgnDcByNoRqstDTO;
	
	// 서비스요소  
	private RqstRsvVarDetlDTO rqstRsvVarDetlDTO;
	
	// 서비스 기타 정보 
	private SvcRqstEtcInfoDTO svcRqstEtcInfoDTO;
	
	
	
	
	
}
