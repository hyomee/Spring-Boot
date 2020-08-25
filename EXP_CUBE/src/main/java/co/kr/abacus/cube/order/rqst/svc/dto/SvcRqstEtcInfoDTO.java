package co.kr.abacus.cube.order.rqst.svc.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class SvcRqstEtcInfoDTO extends BaseDTO{

	
	private long svcEtcSeqno;
	
	private long entrRqstNo;
	
	
	// 신청 일시 
	private Date rqstDttm;
		
	private String rqstPrgrsSttsCd;
	
	// 진행상태변경 적용 일자 
	private Date rqstPrgrsSttsChngDttm;
	
	// 상한옵션 금액
	private long hlmtOptinAmt;
	
	
	// 국제 사업자 코드 
	private String enprCd;
}
