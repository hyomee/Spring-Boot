package co.kr.abacus.cube.contract.svc.entity;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 뮤직온 
@Entity
@Table(name="TB_SB_MSCON_ENTR")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbMsconEntrEntity extends BaseEntity {
	
	@EmbeddedId
	private MsconEntrKeyValue mconEntrKeyValue;
	
	private Date valdStrtDt;
	private Date valdEndDt;
	private String msconEndRsnCd;
	
}
