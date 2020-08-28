package co.kr.abacus.cube.order.rqst.svc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class RealTimeRsvKeyValue implements Serializable {

	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SVC_RSV_SEQNO")
	private long svcRsvSeqmo;

	// 참조
	@Column(name="ENTR_NO")
	private long entrNo;

	// 참조
	@Column(name="SVC_CD")
	private long svcCd;
	
}
