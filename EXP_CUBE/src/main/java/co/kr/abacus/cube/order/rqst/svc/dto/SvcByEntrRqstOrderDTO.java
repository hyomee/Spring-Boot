package co.kr.abacus.cube.order.rqst.svc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SvcByEntrRqstOrderDTO {
	
	
	private String entrNo;
	
	private SvcByEntrRqstDTO svcByEntrRqstDTO;
	private RqstRsvVarDetlDTO rqstRsvVarDetlDTO;

	private AsgnDcByNoRqstDTO asgnDcByNoRqstDTO;
	private SvcRqstEtcInfoDTO svcRqstEtcInfoDTO;
}
