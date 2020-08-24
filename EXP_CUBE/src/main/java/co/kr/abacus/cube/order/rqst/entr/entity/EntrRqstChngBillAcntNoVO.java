package co.kr.abacus.cube.order.rqst.entr.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class EntrRqstChngBillAcntNoVO {

	
	// 번호변경 전 청구계정 번호 
	@Column(name="CHNG_BFR_Bill_ACNT_NO")
	private String chngBfrBillAcntNo;
	
	// 번호변경  후  청구 계정 번호 
	@Column(name="CHNG_AFR_Bill_ACNT_NO")
	private String chngAfrBillAcntNo;
	
			
}
