package co.kr.abacus.cube.order.rqst.entr.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EntrRqstCustVO {

	@Column(name="HLDR_CUST_NO")
	private long hldrCustNo;
	
	@Column(name="RLUSR_CUST_NO")
	private long rlusrCustNo;
	
	@Column(name="CHNG_BFR_NAME_CUST_NO")
	private long chngBfrNameCustNo;
	
	@Column(name="CHNG_AFR_NAME_CUST_NO")
	private long chngAfrNameCustNo;
	
	
}
