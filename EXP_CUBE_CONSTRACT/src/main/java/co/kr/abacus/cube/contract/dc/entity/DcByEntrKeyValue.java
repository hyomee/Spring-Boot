package co.kr.abacus.cube.contract.dc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class DcByEntrKeyValue implements Serializable {
	
	@Column(name="ENTR_NO")
	private long entrNo;
	
	@Column(name="ENTR_BY_DSCNT_SEQNO")
	private long entrByDscntSeqno;

}
