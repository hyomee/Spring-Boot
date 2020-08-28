package co.kr.abacus.cube.contract.entr.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 복지 통신 대상자 
@Entity
@Table(name="TB_SB_WELF_COMM_TRGP")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbWelfCommTrgpEntity extends BaseEntity {

	@EmbeddedId
	private WelfCommTrgrKeyValue welfCommTrgtKeyValue;
	
	private long entrNo;
	
}
