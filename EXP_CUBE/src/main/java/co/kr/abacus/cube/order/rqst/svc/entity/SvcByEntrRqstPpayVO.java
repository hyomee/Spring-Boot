package co.kr.abacus.cube.order.rqst.svc.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrRqstPpayVO {
	
	@Column(name="PPAY_YN")
	private String ppayYn;

}
