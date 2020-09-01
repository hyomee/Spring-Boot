package co.kr.abacus.cube.order.receipt.entrMgmt.entity;

import co.kr.abacus.cube.order.common.entity.ControlFieldVO;
import lombok.*;

import javax.persistence.*;


// 가입신규접수
@Entity
@Table(name="TB_SB_ENTR_RQST")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
@SecondaryTables({ // foreignKey = ,uniqueConstraints =
	@SecondaryTable(name="TB_SB_ENTR_APCNT",
								pkJoinColumns=@PrimaryKeyJoinColumn(name="ENTR_RQST_NO")),
	@SecondaryTable(name="TB_SB_ENTR_RQST_ATRCT_INFO",
								pkJoinColumns=@PrimaryKeyJoinColumn(name="ENTR_RQST_NO")),
	})
public class SbEntrRqstEntity extends ControlFieldVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ENTR_RQST_NO")
	private long entrRqstNo;
	
	@Column(name="WORK_ODER_NO")
	private long workOrdrNo;

	// 서비스 코드 
	@Embedded()
	private EntrRqstServiceValue entrRqstServiceValue;
	
	// 가입 계약 처리 관련 번호 
	@Embedded
	private EntrRqstContractValue entrRqstContractValue;
	
	// 전화 번호 관련 
	@Embedded
	private EntrRqstPhoneNumerValue entrRqstPhoneNumerValue;
	
	// 명의자 고객 관련 
	@Embedded
	private EntrRqstCustValue entrRqstCustValue;
	
	// 상태변경일자 관리 
	@Embedded
	@Setter
	private EntrRqstStatusChangeValue entrRqstStatusChangeValue;
	
	// 가입대리점 관려 
	@Embedded
	private EntrRqstDlrValue entrRqstDlrValue;
	
	// 가입유형 ( 정책 )
	@Embedded
	private EntrRqstPlcyValue entrRqstPlcyValue;
	
	// 번호 이동 
	@Embedded
	private EntrRqstMnpValue entrRqstMnpValue;
	
	// 재기입
	@Embedded
	private EntrRqstRjnValue entrRqstRjnValue;
	
	// 번호 변경 
	@Embedded
	private EntrRqstChngNumberValue entrRqstChngNumberValue;
	
	// 청구계정 변경  
	@Embedded
	private EntrRqstChngBillAcntNoValue entrRqstChngBillAcntNoValue;
	
	// 가입단위일반 관리 영역 
	@Embedded
	private EntrRqstEtcValue entrRqstEtcValue;
	
	// 착신금지발신금지
	@Embedded
	private EntrRqstSendIcallValue entrRqstSendIcallValue;
	
	// PPS 구분 
	@Embedded
	private EntrRqstPpsValue entrRqstPpsValue;
	
	// 가입 신청자
	@Embedded
	private SbEntrApcntValue entrApcntValue;
	
	// 가입 신청 유지차 정보 
	@Embedded
	private SbEntrRqstAtrctInfoValue entrRqstAtrctInfoValue;
	
	@Builder
	public SbEntrRqstEntity(long workOrdrNo,
													EntrRqstServiceValue entrRqstServiceValue,
													SbEntrApcntValue sbEntrApcntValue,
													SbEntrRqstAtrctInfoValue sbEntrRqstAtrctInfoValue) {
		this.workOrdrNo = workOrdrNo;
		this.entrRqstServiceValue = entrRqstServiceValue;
		this.entrApcntValue = sbEntrApcntValue;
		this.entrRqstAtrctInfoValue = sbEntrRqstAtrctInfoValue;

	}


	public void setEntrRqstContractValue(String entrNo, String aceno, String billAcntNo) {
		EntrRqstContractValue entrRqstContractValue = EntrRqstContractValue.builder()
						.entrNo(entrNo)
						.entrNo(aceno)
						.billAcntNo(billAcntNo)
						.build();
	}

	public void setEntrRqstPhoneNumerValue( EntrRqstPhoneNumerValue entrRqstPhoneNumerValue) {
		this.entrRqstPhoneNumerValue = entrRqstPhoneNumerValue;
	}


}