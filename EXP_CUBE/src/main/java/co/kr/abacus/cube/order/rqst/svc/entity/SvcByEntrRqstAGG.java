package co.kr.abacus.cube.order.rqst.svc.entity;

import co.kr.abacus.cube.common.entity.BaseDomain;
import co.kr.abacus.cube.order.rqst.entr.entity.EntrRqstAGG;
import lombok.*;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="TB_SB_SVC_BY_ENTR_RQST")
@ToString(exclude = "rqstRsvVarDetlVO, asgnDcByNoRqst")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
@SecondaryTables({
	@SecondaryTable(name="TB_SB_ETBY_SVC_ADDV_RQST",
								pkJoinColumns=@PrimaryKeyJoinColumn(name="ENTR_SVC_RQST_SEQNO")) })
public class SvcByEntrRqstAGG extends BaseDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ENTR_SVC_RQST_SEQNO")
	private long entrSvcRqstSeqno;

	// 참조
	@Column(name="ENTR_RQST_NO")
	private long entrRqstNo;

	// 참조
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
	@Embedded
	private EtbySvcAddvRqstVO etbySvcAddvRqstVO;
	
	// 서비스 요소 -> TABLE
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "TB_SB_RQST_RSV_VAR_DETL",
					joinColumns = { @JoinColumn(name = "ENTR_SVC_RQST_SEQNO", referencedColumnName = "ENTR_SVC_RQST_SEQNO")})
	@OrderColumn(name="SVC_VAR_DETL_SEQNO")
	private List<RqstRsvVarDetlVO> rqstRsvVarDetlVO;
	
	// 할인 지정 번호 --> TABLE
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "TB_SB_ASGN_RQST_SEQNO",
					joinColumns = { @JoinColumn(name = "ENTR_SVC_RQST_SEQNO", referencedColumnName = "ENTR_SVC_RQST_SEQNO")})
	@OrderColumn(name="ASGN_NO_RQST_SEQNO")
	private List<AsgnDcByNoRqstVO> asgnDcByNoRqst;

	@Builder
	public SvcByEntrRqstAGG(long entrRqstNo, long workOrdrNo, long trstnNo) {
		this.entrRqstNo = entrRqstNo;
		this.workOrdrNo = workOrdrNo;
		this.trstnNo = trstnNo;
	}

}
