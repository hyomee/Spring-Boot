package co.kr.abacus.cube.contract.rmng.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 로밍 안내 
@Entity
@Table(name="TB_SB_RMNG_GUID")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbRmngGuidEntity extends BaseEntity {
	
	@Id
	@Column(name="ENTR_NO")
	private long entrNo;
	
	private Date valdStrtDttm;
	private Date valdEndDttm;
	
	private String guidMnetChceNo;
	private String localGuidBrdNo;
	private String eltmIcallRjctNo;
	

}
