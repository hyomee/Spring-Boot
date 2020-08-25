package co.kr.abacus.cube.order.rqst.svc.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_SB_SVC_BY_ENTR_RQST")
public class SvcByEntrRqstAGG {

	// TB_SB_SVC_BY_ENTR_RQST
	// TB_SB_ETBY_SVC_ADDV_RQST
	
	@Id
	@Column(name="ENTR_SVC_RQST_SEQNO")
	private long entrSvcRqstSeqno;
	
	@Column(name="ENTR_RQST_NO")
	private long entrRqstNo;
	
	@Column(name="WORK_ODER_NO")
	private long workOrdrNo;
	
	
	@Column(name="TRSTN_NO")
	private long trstnNo;
	
	// 서비스 코드 
	@Embedded
	private SvcByEntrRqstServiceVO svcByEntrRqstServiceVO;
	
	// 가입 계약 처리 관련 번호 
	@Embedded
	private SvcByEntrRqstContractVO svcByEntrRqstContractVO;
	
	// 가입별상품정보 
	@Embedded
	private SvcByEntrRqstSvcVO svcByEntrRqstSvcVO;
		
	// 상품 상태에 따른 날짜 관리 
	@Embedded
	private SvcByEntrRqstSvcSttsVO svcByEntrRqstSvcSttsVO;
	
	// 상품 과금 날짜 관리 
	@Embedded
	private SvcByEntrRqstRtngVO svcByEntrRqstRtngVO;
	
	// 상품 의무 사용 관리 
	@Embedded
	private SvcByEntrRqstDutyVO svcByEntrRqstDutyVO;
	
	// 서비스 그룹 
	@Embedded
	private SvcByEntrRqstSvcGrpVO svcByEntrRqstSvcGrpVO;
	
	// 상품 예약 
	@Embedded
	private SvcByEntrRqstRsvVO svcByEntrRqstRsvVO;
	
	// 선납여부
	@Embedded
	private SvcByEntrRqstPpayVO svcByEntrRqstPpayVO;
	
	// 단말 연관 - 단말 약정 
	@Embedded
	private SvcByEntrRqstDevVO svcByEntrRqstDevVO;
	
	// 유치자 정보  ->  TABLE 
	private EtbySvcAddvRqstVO etbySvcAddvRqstVO;
	
	// 서비스 요소 -> TABLE 
	private List<RqstRsvVarDetlVO> rqstRsvVarDetlVO;
	
	// 할인 지정 번호 --> TABLE 
	private List<AsgnDcByNoRqstVO> asgnDcByNoRqst;
	
}
