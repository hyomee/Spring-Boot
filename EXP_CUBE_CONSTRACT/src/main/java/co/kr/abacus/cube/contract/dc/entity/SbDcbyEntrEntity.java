package co.kr.abacus.cube.contract.dc.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_SB_DC_BY_ENTR")
public class SbDcbyEntrEntity {

	@EmbeddedId
	private SbDcByEntrKeyValue sbDcByEntrKeyVO;
	
}
