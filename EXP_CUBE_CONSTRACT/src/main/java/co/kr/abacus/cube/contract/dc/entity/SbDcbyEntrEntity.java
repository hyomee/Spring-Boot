package co.kr.abacus.cube.contract.dc.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_SB_DC_BY_ENTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbDcbyEntrEntity extends BaseEntity {

	@EmbeddedId
	private DcByEntrKeyValue sbDcByEntrKeyValue;
	
}


