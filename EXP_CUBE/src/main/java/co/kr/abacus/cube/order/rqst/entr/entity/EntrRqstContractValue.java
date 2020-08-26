package co.kr.abacus.cube.order.rqst.entr.entity;

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
public class EntrRqstContractValue {
	
	@Column(name="ENTR_NO")
	private long entrNo;
	
	@Column(name="ACENO")
	private long aceno;
	
	@Column(name="BILL_ACNT_NO")
	private long billAcntNo;

}
