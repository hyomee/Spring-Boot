package co.kr.abacus.cube.order.rqst.svc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Table;

import co.kr.abacus.cube.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/* 신규 가입시 지정 번호 할인 등록 
* 상품 변경시 지정 번호 할인 등록 
* 상품 변경 없이 지정 번호 할인 변경 - 상품 신청부에 상품을 변경 없음으로 설정 
*/
@Embeddable
@Table(name="TB_SB_RQST_RSV_VAR_DETL")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RqstRsvVarDetlVO extends BaseEntity {

	@Column(name="ENTR_NO")
	private String entrNo;
	
	// 상품 코드
	@Column(name="SVC_CD")
	private String svcCd;
	
	// 서비스 요소 코드 
	@Column(name="FTR_CD")
	private String ftrCd;
		
	// 서비스요소 유효 시작 일자 
	@Column(name="FTR_VALD_STRT_DT")
	private Date ftrValdStrtDt;
	
	// 서비스요소 유효 시작 일자 
	@Column(name="FTR_VALD_END_DT")
	private Date ftrValdEndDt;
	
	// 서비스 요소 파람 
	@Column(name="VAR_PARAM")
	private Date varParam;
	
	// 변동적용예외 CTN
	@Column(name="VAR_EXCLV_EXCP_CTN")
	private Date varExclvExcpCTN;
	
	// 상품신청 일시 
	@Column(name = "SVC_RQST_DTTM")
	private Date svcRqstDttm;
	
	// 신청진행상태코드 
	@Column(name="RQST_PRGRS_STTS_CD")
	private String rqstPrgrsSttsCd;
	
	// 진행상태변경 적용 일자 
	@Column(name="RQST_PRGRS_STTS_CHNG_DTTM")
	private Date rqstPrgrsSttsChngDttm;
	
}
