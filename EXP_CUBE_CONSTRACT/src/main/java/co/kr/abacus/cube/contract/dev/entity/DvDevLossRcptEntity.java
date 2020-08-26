package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 단말기 분실 접수 
@Entity
@Table(name="TB_DV_DEV_LOSS_RCPT")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvDevLossRcptEntity extends BaseEntity {
	
	@EmbeddedId
	private DevLossRcptKeyValue devLossRcptKeyValue;
	
	private String rcptDvCd;
	
	private String prssDlrCd;

}
