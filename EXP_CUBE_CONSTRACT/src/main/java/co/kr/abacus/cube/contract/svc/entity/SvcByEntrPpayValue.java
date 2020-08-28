package co.kr.abacus.cube.contract.svc.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrPpayValue {
	@Column(name="PPAY_YN")
	private String ppayYn;
}
