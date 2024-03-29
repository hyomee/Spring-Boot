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

@Entity
@Table(name="TB_SB_KONG_HLMT_OPTN")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbKongHlmtOptnEntity extends BaseEntity {
	
	@EmbeddedId
	private KongHlmtOptnKeyValue kongHlmtOptnKeyValue;
	
	private String ppCd;
	private String sttsCd;
	private Date valdStrtDt;
	private Date valdEndDt;
	private long hlmtOptnAmt;
	
}
