package co.kr.abacus.cube.contract.dev.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CpnKeyValue implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="CPN_NO")
	private long cpnNo;
	
	@Column(name="CPN_FORM_CD")
	private long cpnFormCd;

}
