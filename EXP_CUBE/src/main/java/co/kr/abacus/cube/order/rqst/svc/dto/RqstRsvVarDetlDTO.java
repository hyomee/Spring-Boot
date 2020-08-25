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
public class RqstRsvVarDetlDTO {	

	
	private long entrSvcRqstSeqno;
	
	private long svcVarDerlsEQNO;
	
	
	private String entrNo;
	
	// 상품 코드
	private String svcCd;
	
	// 서비스 요소 코드 
	private String ftrCd;
		
	// 서비스요소 유효 시작 일자 
	private Date ftrValdStrtDt;
	
	// 서비스요소 유효 시작 일자 
	private Date ftrValdEndDt;
	
	// 서비스 요소 파람 
	private Date varParam;
	
	// 변동적용예외 CTN
	private Date varExclvExcpCTN;
	
	// 상품신청 일시 
	private Date svcRqstDttm;
	
	// 신청진행상태코드 
	private String rqstPrgrsSttsCd;
	
	// 진행상태변경 적용 일자 
	private Date rqstPrgrsSttsChngDttm;
}
