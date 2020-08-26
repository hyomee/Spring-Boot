package co.kr.abacus.cube.contract.svc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class SvcByEntrKeyValue implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="ENTR_SVC_SEQ")
	private long entrSvcSeq;
	
	@Column(name="ENTR_NO")
	private long entrNo;
}
