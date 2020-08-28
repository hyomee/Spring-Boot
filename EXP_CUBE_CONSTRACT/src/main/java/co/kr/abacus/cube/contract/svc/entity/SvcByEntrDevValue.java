package co.kr.abacus.cube.contract.svc.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrDevValue {

	@Column(name="ENTR_DEVC_RQST_SEQNO")
	private long entrDevcRqstSeqno;
}
