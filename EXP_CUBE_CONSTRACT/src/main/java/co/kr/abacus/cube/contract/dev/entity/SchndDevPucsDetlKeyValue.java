package co.kr.abacus.cube.contract.dev.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SchndDevPucsDetlKeyValue  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="SCHND_DEV_PUCS_DETL_SEQNO")
	private Date schdDevPucsDetlSeqno;
	
	@Column(name="ENTR_NO")
	private long entrNo;
	
	@Column(name="DEV_SALE_SEQNO")
	private long devSaleSeqno;
	
	@Column(name="SCHND_DEV_PUCS_SEQNO")
	private long schdDevPucsSeqno;

}
