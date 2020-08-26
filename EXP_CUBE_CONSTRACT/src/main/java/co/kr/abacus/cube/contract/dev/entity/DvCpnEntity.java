package co.kr.abacus.cube.contract.dev.entity;

import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


// 단말 쿠폰 
@Entity
@Table(name="TB_DV_CPN")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class DvCpnEntity extends BaseEntity {

	@EmbeddedId
	private CpnKeyValue cpnKeyValue;
	
	// 가입번호 
	private long entrNo;
}
