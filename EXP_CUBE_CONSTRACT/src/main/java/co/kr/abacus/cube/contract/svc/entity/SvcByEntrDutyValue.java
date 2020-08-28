package co.kr.abacus.cube.contract.svc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrDutyValue {
	// 상품 의무 사용 시작 일자 
	@Column(name="SVC_DUTY_USE_STRT_DT")
	private Date svcDutyUseStrtDt;
	
	// 상품 의무 사용 종료 일자 
	@Column(name="SVC_DUTY_USE_END_DT")
	private Date svcDutyUseEndDt;
	
	
	// 상품 의무 사용 개월 수 
	@Column(name="SVC_DUTY_USE_MNTN_CNT")
	private int svcDudyUseMntnCnt;
	
	// 상품 의무 사용 구분 코드
	@Column(name="SVC_DUTY_USE_DV_CD")
	private int svcDudyUseDvCd;
}
