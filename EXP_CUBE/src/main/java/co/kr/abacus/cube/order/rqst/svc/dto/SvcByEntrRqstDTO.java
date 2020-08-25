package co.kr.abacus.cube.order.rqst.svc.dto;

import co.kr.abacus.cube.common.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SvcByEntrRqstDTO extends BaseDTO {

	private long entrSvcRqstSeqno;
	private long entrRqstNo;

	private long workOrdrNo;
	private long trstnNo;
	
//	// 서비스 코드 
//	@Embedded
//	private SvcByEntrRqstServiceVO svcByEntrRqstServiceVO;
//	
//	// 가입 계약 처리 관련 번호 
//	@Embedded
//	private SvcByEntrRqstContractVO svcByEntrRqstContractVO;
//	
//	// 가입별상품정보 
//	@Embedded
//	private SvcByEntrRqstSvcVO svcByEntrRqstSvcVO;
//		
//	// 상품 상태에 따른 날짜 관리 
//	@Embedded
//	private SvcByEntrRqstSvcSttsVO svcByEntrRqstSvcSttsVO;
//	
//	// 상품 과금 날짜 관리 
//	@Embedded
//	private SvcByEntrRqstRtngVO svcByEntrRqstRtngVO;
//	
//	// 상품 의무 사용 관리 
//	@Embedded
//	private SvcByEntrRqstDutyVO svcByEntrRqstDutyVO;
//	
//	// 서비스 그룹 
//	@Embedded
//	private SvcByEntrRqstSvcGrpVO svcByEntrRqstSvcGrpVO;
//	
//	// 상품 예약 
//	@Embedded
//	private SvcByEntrRqstRsvVO svcByEntrRqstRsvVO;
//	
//	// 선납여부
//	@Embedded
//	private SvcByEntrRqstPpayVO svcByEntrRqstPpayVO;
//	
//	// 단말 연관 - 단말 약정 
//	@Embedded
//	private SvcByEntrRqstDevVO svcByEntrRqstDevVO;
//	
//	// 유치자 정보  ->  TABLE
//	@Embedded
//	private EtbySvcAddvRqstVO etbySvcAddvRqstVO;
}
