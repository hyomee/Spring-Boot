package co.kr.abacus.cube.order.receipt.entrMgmt.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EntrRqstCustValue {

	@Column(name="HLDR_CUST_NO")
	private long hldrCustNo;
	
	@Column(name="RLUSR_CUST_NO")
	private long rlusrCustNo;
	
	@Column(name="CHNG_BFR_NAME_CUST_NO")
	private long chngBfrNameCustNo;
	
	@Column(name="CHNG_AFR_NAME_CUST_NO")
	private long chngAfrNameCustNo;
	
	
}
