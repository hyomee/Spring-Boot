package co.kr.abacus.cube.contract.dev.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BnkCpnDscntKeyValue implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="BANK_CD")
	private String bankCd;
	
	@Column(name="BANK_CPN_NO")
	private String bankCpnNo;
	

}
