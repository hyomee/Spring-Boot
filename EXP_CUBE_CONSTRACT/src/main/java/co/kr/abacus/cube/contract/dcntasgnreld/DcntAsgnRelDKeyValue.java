package co.kr.abacus.cube.contract.dcntasgnreld;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DcntAsgnRelDKeyValue implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="MENTR_NO")
	private long mentrNo;
	
	@Column(name="DSCNT_ASGN_ENTR_NO")
	private long dscntAsgnEntrNo;
	
	@Column(name="DSCNT_ASGN_STRT_DTTM")
	private long dscntAsgnStrtDttm;
}
