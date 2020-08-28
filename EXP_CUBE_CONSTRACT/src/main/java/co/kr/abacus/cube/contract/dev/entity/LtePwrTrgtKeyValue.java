package co.kr.abacus.cube.contract.dev.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LtePwrTrgtKeyValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DEV_SALE_SEQNO")
	private long devSaleSeqno;

	// 참조
	@Column(name="ENTR_NO")
	private long entrNo;
}
