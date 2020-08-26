package co.kr.abacus.cube.order.rqst.svc.entity;

import java.util.Date;

import javax.persistence.*;

import co.kr.abacus.cube.common.entity.BaseEntity;
import co.kr.abacus.cube.order.rqst.entr.entity.EntrRqstEntity;
import lombok.*;

// 요금제 상한 값 ( 청소년 요금제 )
@Entity
@Table(name="TB_SB_SVC_RQST_ETC_INFO")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SvcRqstEtcInfoAGG extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SVC_ETC_SEQNO")
	private long svcEtcSeqno;
	
	@Column(name="ENTR_RQST_NO")
	private long entrRqstNo;
	
	
	// 신청 일시 
	@Column(name = "RQST_DTTM")
	private Date rqstDttm;
		
	@Column(name="RQST_PRGRS_STTS_CD")
	private String rqstPrgrsSttsCd;
	
	// 진행상태변경 적용 일자 
	@Column(name="RQST_PRGRS_STTS_CHNG_DTTM")
	private Date rqstPrgrsSttsChngDttm;
	
	// 상한옵션 금액
	@Column(name="HLMT_OPTIN_AMT")
	private long hlmtOptinAmt;
	
	
	// 국제 사업자 코드 
	@Column(name="ENPR_CD")
	private String enprCd;
	
}
