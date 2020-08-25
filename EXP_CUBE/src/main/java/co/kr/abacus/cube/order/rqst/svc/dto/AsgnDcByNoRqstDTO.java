package co.kr.abacus.cube.order.rqst.svc.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AsgnDcByNoRqstDTO  {
	
	private long entrSvcRqstSeqno;
	
	private long asgnNoRqstSeqno; 
	
	// 지정 할인 전화번호 
	private String asgnDscntTelno;
	
	// 헐인서비스 코드 
	private String dscntProdCd;
	
	// 할인 신텅 진행 상태 코드 
	private String rqstPrgrsSttsCd;
	
	// 할인 진행 상태 변경 일시 
	private Date rqstPrgrsSttsChngDttm;
	
	// 할인 신청 구분 코드 
	private String dscntRqstDvCd;
}
