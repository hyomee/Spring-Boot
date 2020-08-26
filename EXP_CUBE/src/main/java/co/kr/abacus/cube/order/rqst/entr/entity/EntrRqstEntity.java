package co.kr.abacus.cube.order.rqst.entr.entity;

import javax.persistence.*;

import co.kr.abacus.cube.common.entity.BaseEntity;
import lombok.*;

@Entity
@Table(name="TB_SB_ENTR_RQST")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
@SecondaryTables({
	@SecondaryTable(name="TB_SB_ENTR_APCNT",
								pkJoinColumns=@PrimaryKeyJoinColumn(name="ENTR_RQST_NO")),
	@SecondaryTable(name="TB_SB_ENTR_RQST_ATRCT_INFO",
								pkJoinColumns=@PrimaryKeyJoinColumn(name="ENTR_RQST_NO")),
	})
public class EntrRqstEntity extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ENTR_RQST_NO")
	private long entrRqstNo;
	
	@Column(name="WORK_ODER_NO")
	private long workOrdrNo;

	// 서비스 코드 
	@Embedded()
	private EntrRqstServiceVO entrRqstServiceVO;
	
	// 가입 계약 처리 관련 번호 
	@Embedded
	private EntrRqstContractVO entrRqstContractVO;
	
	// 전화 번호 관련 
	@Embedded
	private EntrRqstPhoneNumerVO entrRqstPhoneNumerVO;
	
	// 명의자 고객 관련 
	@Embedded
	private EntrRqstCustVO entrRqstCustVO;
	
	// 상태변경일자 관리 
	@Embedded
	private EntrRqstStatusChangeVO entrRqstStatusChangeVO;
	
	// 가입대리점 관려 
	@Embedded
	private EntrRqstDlrVO entrRqstDlrVO;
	
	// 가입유형 ( 정책 )
	@Embedded
	private EntrRqstPlcyVO entrRqstPlcyVO;
	
	// 번호 이동 
	@Embedded
	private EntrRqstMnpVO entrRqstMnpVO;
	
	// 재기입
	@Embedded
	private EntrRqstRjnVO entrRqstRjnVO;
	
	// 번호 변경 
	@Embedded
	private EntrRqstChngNumberVO entrRqstChngNumberVO;
	
	// 청구계정 변경  
	@Embedded
	private EntrRqstChngBillAcntNoVO entrRqstChngBillAcntNoVO;
	
	// 가입단위일반 관리 영역 
	@Embedded
	private EntrRqstEtcVO entrRqstEtcVO;
	
	// 착신금지발신금지
	@Embedded
	private EntrRqstSendIcallVO entrRqstSendIcallVO;
	
	// PPS 구분 
	@Embedded
	private EntrRqstPpsVO entrRqstPpsVO;
	
	// 가입 신청자 
	@Embedded
	private EntrApcntValue entrApcntValue;
	
	// 가입 신청 유지차 정보 
	@Embedded
	private EntrRqstAtrctInfoValue entrRqstAtrctInfoValue;
	
	@Builder
	public EntrRqstEntity(long workOrdrNo) {
		this.workOrdrNo = workOrdrNo;
	}

}