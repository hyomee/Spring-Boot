package co.kr.abacus.cube.order.rqst.entr.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EntrRqstMnpVO {

	// 번호이동 전 사업자 코드 
	@Column(name="MNP_BFR_ENFR_CD")
	private String mnpBfrEnfrCd;
	
	// 번호이동 후 사업자 코드 
	@Column(name="MNP_AFT_ENFR_CD")
	private String mnpAftEnfrCd;
	
	// 번호 이동 유형 코드 
	@Column(name="MNP_KD_CD")
	private String mnpKdCd;
	
	// 번호 이동 상태 코드 
	@Column(name="MNP_STTS_CD")
	private String mnpSttsCd;
	
	
	
	
}
