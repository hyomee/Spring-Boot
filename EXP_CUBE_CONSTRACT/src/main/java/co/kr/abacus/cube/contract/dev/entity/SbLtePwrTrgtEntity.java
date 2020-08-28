package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


// 판매 시점에 발생 LTE 파워 할인 대상 관리
@Entity
@Table(name="TB_SB_LTE_PWR_TRGT")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbLtePwrTrgtEntity extends BaseEntity {
	
	@EmbeddedId
	private LtePwrTrgtKeyValue ltePwrTrgtKeyValue;
	
	private String devcMdlCd;
	private long aceno;
	private long billAcntNo;
	
	

}
