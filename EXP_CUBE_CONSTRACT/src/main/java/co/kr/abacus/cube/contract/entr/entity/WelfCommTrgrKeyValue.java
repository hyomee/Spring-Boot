package co.kr.abacus.cube.contract.entr.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Embeddable

public class WelfCommTrgrKeyValue implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="WELF_COMM_TRGT_SEQNO")
	private long svcRsvSeqno;

	@Column(name="custNo")
	private long custNo;
}
