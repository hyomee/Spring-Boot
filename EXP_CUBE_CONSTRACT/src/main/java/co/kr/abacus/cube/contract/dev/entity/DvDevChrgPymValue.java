package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Embeddable;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Table(name="TB_DV_CHRG_PYM")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvDevChrgPymValue extends BaseEntity {
	
	private String itemId;
	
	private String manfSerialNo;
}
