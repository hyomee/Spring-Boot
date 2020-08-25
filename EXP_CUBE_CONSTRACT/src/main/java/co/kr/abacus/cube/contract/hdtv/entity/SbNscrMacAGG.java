package co.kr.abacus.cube.contract.hdtv.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_SB_NSCR_MAC")
public class SbNscrMacAGG {

	@EmbeddedId
	private SbNscrMacKeyVO sbNscrMacKeyVO;
	
}
