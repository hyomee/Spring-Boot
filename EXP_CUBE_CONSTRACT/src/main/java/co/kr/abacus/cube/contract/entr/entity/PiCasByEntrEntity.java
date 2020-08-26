package co.kr.abacus.cube.contract.entr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="TB_PI_CAS_BY_ENTR")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PiCasByEntrEntity extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MEMBER_NO")
	private long memberNo;
	
	@Column(name="WEMB_ID")
	private String WembId;
	
	@Column(name="ENTR_NO")
	private long entrNo;
}
