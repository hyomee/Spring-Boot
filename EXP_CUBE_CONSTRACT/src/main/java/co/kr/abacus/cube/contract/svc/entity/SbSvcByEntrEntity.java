package co.kr.abacus.cube.contract.svc.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;



@Entity
@Table(name="TB_SB_SVC_BY_ENTR")
public class SbSvcByEntrEntity {	
	
	@EmbeddedId
	private SvcByEntrKeyValue SbSvcByEntrKeyValue;
	
	// 참조
	@Column(name="WORK_ODER_NO")
	private long workOrdrNo;
	
	@Column(name="TRSTN_NO")
	private long trstnNo;
	
	// 서비스 코드 
	@Embedded
	private SvcByEntrServiceValue svcByEntrServiceValue;
	
	// 가입 계약 처리 관련 번호 
	@Embedded
	private SvcByEntrContractValue svcByEntrContractValue;
	
	// 가입별상품정보 
	@Embedded
	private SvcByEntrSvcValue svcByEntrSvcValue;
		
	// 상품 상태에 따른 날짜 관리 
	@Embedded
	private SvcByEntrSvcSttsValue svcByEntrSvcSttsValue;
	
	// 상품 과금 날짜 관리 
	@Embedded
	private SvcByEntrRtngValue svcByEntrRtngValue;
	
	// 상품 의무 사용 관리 
	@Embedded
	private SvcByEntrDutyValue svcByEntrDutyValue;
	
	// 서비스 그룹 
	@Embedded
	private SvcByEntrSvcGrpValue svcByEntrSvcGrpValue;
	
	// 상품 예약 
	@Embedded
	private SvcByEntrRsvValue svcByEntrRsvValue;
	
	// 선납여부
	@Embedded
	private SvcByEntrPpayValue svcByEntrPpayValue;
	
	// 단말 연관 - 단말 약정 
	@Embedded
	private SvcByEntrDevValue svcByEntrDevValue;
	
	// 유치자 정보  ->  TABLE  TB_SB_ETBY_SVC_ADDV
	@Embedded
	private SbEtbySvcAddvValue sbEtbySvcAddvValue;
	
	
	// 서비스 요소 -> TABLE
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "TB_SB_RSV_VAR_DETL",
					joinColumns = { @JoinColumn(name = "ENTR_SVC_SEQNO", referencedColumnName = "ENTR_SVC_SEQNO")})
	@OrderColumn(name="SVC_VAR_DETL_SEQNO")
	private List<SbFtrVarDtlValue> sbFtrVarDtlValueList;
	

	// 할인 지정 번호 --> TABLE
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "TB_SB_ASGN_SEQNO",
					joinColumns = { @JoinColumn(name = "ENTR_SVC_SEQNO", referencedColumnName = "ENTR_SVC_SEQNO")})
	@OrderColumn(name="ASGN_NO_SEQNO", columnDefinition = "long")
	private List<SbAsgnDcByNoValue> sbAsgnDcByNoValueList;

	
	// 테이터 상품권 --> TB_SB_GIFT_SVC_ENTR
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "TB_SB_GIFT_SVC_ENTR",
					joinColumns = { @JoinColumn(name = "ENTR_SVC_SEQNO", referencedColumnName = "ENTR_SVC_SEQNO")})
	@OrderColumn(name="ENTR_GIFT_SEQNO", columnDefinition = "long")
	private List<SbGiftSvcEntrValue> sbGiftSvcEntrValueList;
	
	

}
