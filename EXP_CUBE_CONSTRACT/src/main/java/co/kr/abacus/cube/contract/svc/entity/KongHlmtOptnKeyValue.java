package co.kr.abacus.cube.contract.svc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class KongHlmtOptnKeyValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="KONG_HLMT_OPTN_SEQNO")
	private long svcRsvSeqno;

	// 참조
	@Column(name="ENTR_NO")
	private long entrNo;

}
