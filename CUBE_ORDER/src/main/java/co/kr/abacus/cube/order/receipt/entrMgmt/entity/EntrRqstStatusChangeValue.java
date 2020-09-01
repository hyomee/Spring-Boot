package co.kr.abacus.cube.order.receipt.entrMgmt.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class EntrRqstStatusChangeValue {
	
	// 신청 상태 구분  
	@Column(name="RQST_DV_CD")
	private String entrRqstDvCd;
	
	// 가입상태변경 사유 코드 
	@Column(name="ENTR_STTS_CHNG_RSN_CD")
	private String entrSttsChngRsnCd;
	
	// 가입상태변경사유 코드 
	@Column(name="ENTR_STTS_CHNG_RSN_DTL_CD")
	private String entrSttsChngRsnDrlCd;
	
	// 취소 사유 구분 코드 
	@Column(name="CHCL_RSN_DV_CD")
	private String chclRsnDvCd;
	
	//TODO 향후 ENUM으로 변경 처리 
	@Column(name="PRGRS_STTS_CD")
	private String prgrsSttsCd;
	
	// 최초 가입 신청 일자 
	// 가입 진행 상태가 R인 경우 
	@Column(name="RQST_DT")
	private String rqstDt;
	
	// 진행상태변경 적용 일자 
	@Column(name="PRGRS_STTS_CHNG_APLY_DT")
	private String prgrsSttsChngAplyDt;
	
	// 가입 신청 개통 일시 
	@Column(name="ENTR_RQST_SBGN_DT")
	private String entrRqstSbgnDt;

	@Builder
	public EntrRqstStatusChangeValue(String prgrsSttsCd) {
		this.prgrsSttsCd = prgrsSttsCd;
	}
	// 진행 상태 변경 적용 일자 체크 
	// 숫자 8자 인지 체크 필요 
	private void setRqstDt(String rqstDt) {
		// TODO 날짜 검증
		this.rqstDt = rqstDt;
	}
		
	
	// 진행 상태 변경 적용 일자 체크 
	// 숫자 8자 인지 체크 필요 
	private void setPrgrsSttsChngAplyDt(String chngAplyDt) {
		// TODO 날짜 검증
		this.prgrsSttsChngAplyDt = chngAplyDt;
	}
	
	
}
