package co.kr.abacus.cube.contract.svc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Table(name="TB_SB_ASGN_SEQNO")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbAsgnDcByNoValue extends BaseEntity{


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
