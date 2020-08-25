package co.kr.abacus.cube.order.rqst.svc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.kr.abacus.cube.common.entity.BaseDomain;

/*
 * 신규 가입시 지정 번호 할인 등록 
 * 상품 변경시 지정 번호 할인 등록 
 * 상품 변경 없이 지정 번호 할인 변경 - 상품 신청부에 상품을 변경 없음으로 설정 
 */
@Table(name="TB_SB_ASGN_RQST_SEQNO")
public class AsgnDcByNoRqstVO extends BaseDomain{
	
	@Id
	@Column(name="ASGN_NO_RQST_SEQNO")
	private long asgnNoRqstSeqno;	
	
//	@Id
//	@Column(name="ENTR_SVC_RQST_SEQNO")
//	private long entrSvcRqstSeqno;
	
	// 지정 할인 전화번호 
	@Column(name="ASGN_DSCNT_TELNO")
	private String asgnDscntTelno;
	
	// 헐인서비스 코드 
	@Column(name="DSCNT_PROD_CD")
	private String dscntProdCd;
	
	// 할인 신텅 진행 상태 코드 
	@Column(name="RQST_PRGRS_STTS_CD")
	private String rqstPrgrsSttsCd;
	
	// 할인 진행 상태 변경 일시 
	@Column(name="RQST_PRGRS_STTS_CHNG_DTTM")
	private Date rqstPrgrsSttsChngDttm;
	
	// 할인 신청 구분 코드 
	@Column(name="DSCNT_RQST_DV_CD")
	private String dscntRqstDvCd;
	

}
