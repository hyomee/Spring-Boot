package co.kr.abacus.cube.order.rqst.svc.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrRqstDevVO {

	@Column(name="ENTR_DEVC_RQST_SEQNO")
	private long entrDevcRqstSeqno;
}
