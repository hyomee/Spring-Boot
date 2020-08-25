package co.kr.abacus.cube.contract.hdtv.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_SB_UIPTV_ENTR_INFO")
public class SbUiptvEntrInfoAGG {
	
	@Id
	private long entrNo;
	
	private SbUiptvSvcInfoVO sbUiptvSvcInfoVO;

}
