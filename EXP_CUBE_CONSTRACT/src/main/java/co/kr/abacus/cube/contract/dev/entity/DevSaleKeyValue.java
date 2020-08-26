package co.kr.abacus.cube.contract.dev.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class DevSaleKeyValue implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="ENTR_NO")
	private long entrNo;
	
	@Column(name="DEV_SALE_SEQNO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long devSaleSeqno;

}
