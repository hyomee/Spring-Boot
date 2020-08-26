package co.kr.abacus.cube.contract.dev.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class BcPrtCvrtTrgtKeyValue implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="RQST_DT")
	private Date rqstDt;
	
	@Column(name="ENTR_NO")
	private long entrNo;
	
	@Column(name="CARD_ISUS_PERS_NO")
	private long cardIsusPresNo;

}
