package co.kr.abacus.cube.contract.dev.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class DcClubEntrKeyValue implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="ENTR_NO")
	private long entrNo;
	
	@Column(name="CLUB_DV_CD")
	private String clubDvCd;
	
	@Column(name="SVC_CD")
	private String svcCd;
	
	@Column(name="ENTR_SEQNO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long entrSeqno;

}
