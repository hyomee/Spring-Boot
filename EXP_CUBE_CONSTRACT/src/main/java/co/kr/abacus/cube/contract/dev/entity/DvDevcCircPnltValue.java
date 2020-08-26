package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Embeddable;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Table(name="TB_DV_DEVC_CIRC_PNLT")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvDevcCircPnltValue extends BaseEntity {
	
	private long devSaleSeqno;
	
	private long prevSvcCd;
	

}
