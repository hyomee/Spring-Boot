package co.kr.abacus.cube.contract.svc.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrContractValue {
	@Column(name="ENTR_NO")
	private long entrNo;
	
	@Column(name="ACENO")
	private long aceno;
	
	@Column(name="BILL_ACNT_NO")
	private long billAcntNo;
}
