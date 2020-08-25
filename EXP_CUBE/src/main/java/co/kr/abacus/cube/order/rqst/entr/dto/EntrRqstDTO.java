package co.kr.abacus.cube.order.rqst.entr.dto;

import java.util.Date;

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
public class EntrRqstDTO extends BaseDTO {

	
	private long entrRqstNo;
	private long workOrdrNo;


	private String svcgrpCd;
	private String prodCd;
	
	private long entrNo;
	private long aceno;	
	private long billAcntNo;
	
	// 전화 번호 
	private String prodNo;	
	// 가상번호 
	private String vtNo;
	// IMS번호 
	private String imsiNo;	
	// MIN번호 
	private String minNo;		
	// MIC번호
	private String micNo;

	
	private long hldrCustNo;
	private long rlusrCustNo;	
	private long chngBfrNameCustNo;
	private long chngAfrNameCustNo;
	
	// 신청 상태 구분  
	private String entrRqstDvCd;
	
	// 가입상태변경 사유 코드 
	private String entrSttsChngRsnCd;
	
	// 가입상태변경사유 코드 
	private String entrSttsChngRsnDrlCd;
	
	// 취소 사유 구분 코드 
	private String chclRsnDvCd;
	
	//TODO 향후 ENUM으로 변경 처리 
	private String prgrsSttsCd;
	
	// 최초 가입 신청 일자 
	// 가입 진행 상태가 R인 경우 
	private String rqstDt;
	
	// 진행상태변경 적용 일자 
	private String prgrsSttsChngAplyDt;
	
	// 가입 신청 개통 일시 
	private String entrRqstSbgnDt;
	
	// 마켓코드 
	private String mrktCd;
	
	// 가입 대리점 
	private String entrDlrCd;
	
	// 법인 솔류션 코드 
	private String SLTN;
	
	// 최초 신정차 ID 
	private String frstApcntId;
	
	
	// 대리점 전용 1
	private String dlrExclvInf01;
	
	// 대리점 전용 2
	private String dlrExclvInf02;
	
	// 대리점 전용 3
	private String dlrExclvInf03;
	
	// 가입유형 ( 정책 )
	// 가입 유형 코드 
	private String entrKdCd;
	
	// 가입영업정책코드
	private String entrBizPlcyCd;
	
	// 최초영업정책그룹코드
	private String entrBizPlcyGrpCd;
	
	// 최초영업정책레벨코드
	private String entrBizPlcyLvlCd;
	
	// 최초영업정책적용시작일자 
	private Date entrBizPlcyAplyStrtDttm;
	
	// 최초영업정책변경일자 
	private Date entrBizPlcyChngDttm;
	
	// 번호 이동 
	// 번호이동 전 사업자 코드 
	private String mnpBfrEnfrCd;
	
	// 번호이동 후 사업자 코드 
	private String mnpAftEnfrCd;
	
	// 번호 이동 유형 코드 
	private String mnpKdCd;
	
	// 번호 이동 상태 코드 
	private String mnpSttsCd;
	
	// 재기입
	// 재가입 일시 
	private Date Rjnttm;
	
	// 재가입 여부 
	private String rjnYn;
	
	// 번호 변경 
	// 번호변경 전 상품번호
	private String chngBfrProdNo;
		
	// 번호변경  후  상품번호
	private String chngAfrProdNo;
	
	// 청구계정 변경  
	// 번호변경 전 청구계정 번호 
	private String chngBfrBillAcntNo;
	
	// 번호변경  후  청구 계정 번호 
	private String chngAfrBillAcntNo;
	
	// 가입단위일반 관리 영역 
	// 분리 과금 여부 
	private String sprtRtngYn;
	
	// 분리과금유효종료일자 
	private String sprtRtngValdEndDt;
	
	// 착신금지발신금지
	// 발신금지여부 
	private String sendPhbYn;
	
	// 착신금지여부 
	private String icallPhbYn;
	
	// PPS 구분 
	// 발신금지여부 
	private String ppayEntrDvCd;
	
	// 발신금지여부 
	private String ppsEntrAppfEcptYn;
	
	// 발신금지여부 
	private String ppsEntrAppfEcptDt;
}
