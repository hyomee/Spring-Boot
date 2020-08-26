package co.kr.abacus.cube.contract.dcntasgnreld;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;

@Entity
@Table(name="TB_SB_DCNT_ASGN_REL_D")
public class SbDcntAsgnRelDAGG extends BaseEntity{

	@EmbeddedId
	private SbDcntAsgnRelDKeyVO sbDcntAsgnRelDKeyVO;
	
	private Date dscntAsgnEndDttm;
	
	private String dscntAsgnKdCd;
	
}
