package co.kr.abacus.cube.order.receipt.entrMgmt.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EntrRqstContractValue {
	
	@Column(name="ENTR_NO")
	private String entrNo;
	
	@Column(name="ACENO")
	private String aceno;
	
	@Column(name="BILL_ACNT_NO")
	private String billAcntNo;

  @Builder
	public  EntrRqstContractValue(String entrNo, String aceno, String billAcntNo) {
		this.entrNo = entrNo;
		this.aceno = aceno;
		this.billAcntNo = billAcntNo;
	}

}
