package co.kr.abacus.cube.order.rqst.svc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrRqstSvcSttsValue {
	
	//TODO 향후 ENUM으로 변경 처리 
	@Column(name="RQST_PRGRS_STTS_CD")
	private String rqstPrgrsSttsCd;
	
	// 진행상태변경 적용 일자 
	@Column(name="RQST_PRGRS_STTS_CHNG_DTTM")
	private Date rqstPrgrsSttsChngDttm;
		
	// 상품신청 일시 
	@Column(name = "SVC_RQST_DTTM")
	private Date svcRqstDttm;
		
	// 상품상태코드 A,C
	@Column(name = "SVC_STTS_CD")
	private String svcSttsCd;
	
	// 상품상태 변경 일시
	@Column(name = "SVC_STTS_CHNG_DTTM")
	private Date svcSttsChngDttm;
	
	
	
	
	// 상품 시작 등록 일시  SVC_STTS_CD = A
	@Column(name="SVC_STRT_RQST_DTTM")
	private Date svcStrtRqstDttm;
	
	// 상품 시작 사유 코드 
	@Column(name="SVC_STRT_RSN_CD")
	private String svcSTRTRsnCd;
	
	// 상품  시작 일시 
	@Column(name="SVC_STRT_DTTM")
	private Date svcStrtDttm;
	
	// 상품 최초 시작 일시 
	@Column(name="SVC_FRST_STRT_DTTM")
	private Date svcFrstStrtDttm;
	
	
	
	// 상품 종료 사유 코드  SVC_STTS_CD = C
	@Column(name="SVC_END_RSN_CD")
	private String svcSttsRsnCd;
	
	// 상품 종료 등록 일시 
	@Column(name="SVC_END_RQST_DTTM")
	private Date svcEndRqstDttm;
	
	// 상품 종료  일시 
	@Column(name="SVC_END_DTTM")
	private Date svcEndDttm;
	
	
}
