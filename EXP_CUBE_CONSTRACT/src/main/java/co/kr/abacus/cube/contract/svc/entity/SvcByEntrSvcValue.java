package co.kr.abacus.cube.contract.svc.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrSvcValue {
	
	
	// 상품 코드
	@Column(name="SVC_CD")
	private String svcCd;
	
	// 가입상품누적번호
	@Column(name="ENTR_SVC_SEQNO")
	private long entrSvcSeqno;
		
	
	// 상위 상품 코드
	@Column(name="HPOS_SVC_CD")
	private String hposSvcCd;
	
	// 상위 상품 누적 번호 
	@Column(name="HPOS_ENTR_SVC_SEQNO")
	private long hposEntrSvcSeqno;
	
	// 상품 유형 코드 
	@Column(name="SVC_KD_CD")
	private String svcKdCd;
	
	// 상품 유형 코드 
	@Column(name="SVC_DTL_CD")
	private String svcDtlCd;
	
	// 적용레베벨코드 
	@Column(name="APLY_LVL_CD")
	private String aplyLvlCd;
	
	// 상품 관계 코드 
	@Column(name="SVC_RELS_DV_CD")
	private String svcRelsDvCd;
	
	// 맛보기 전환 상품 코드 
	@Column(name="NDBL_CVRT_SVC_CD")
	private String ndblCvrtSvcCd;
}
