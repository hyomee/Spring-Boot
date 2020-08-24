package co.kr.abacus.cube.order.rqst.entr.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EntrRqstEtcVO {
	
	// 분리 과금 여부 
	@Column(name="SPRT_RTNG_YN")
	private String sprtRtngYn;
	
	// 분리과금유효종료일자 
	@Column(name="SPRT_RTNG_VALD_END_DT")
	private String sprtRtngValdEndDt;
	
	// 소액결재사용거부 
	// 자동과금사용거부
	// 통합과금사용거부
	// 법인과금사용거부 
	
	// 금융거래 신용 불량 여부 
	

	
	
	
	
	

}
