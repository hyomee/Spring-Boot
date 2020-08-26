package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 가입별 부가 장치
@Entity
@Table(name="TB_DV_ADDEV_BY_ENTR")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class DvAddevByEntrEntity extends BaseEntity {
	
	// 가입번호 , 가입별 부가장치 누적 번호
	@EmbeddedId
	private DvAddevByEntrKeyValue  dvAddevByEntrKeyValue;
	
	// 부가장치 모델 코드 
	@Column(name="ADDEV_MDL_CD")
	private String addevMdlCd;
	
	// 부가장치 모델 일련 번호 
	@Column(name="ADDEV_MDL_SRLNO")
	private String addevMdlSrlno;
	
	// 모델 구분 코드 
	@Column(name="MDL_DV_CD")
	private String mdlDvCd;
	
	// 부가 장치 유효 시작 일자 
	// 부가 장치 유효 종료 일자
	// 처리 대리점 코드 
	// 부가 장치 변경 사유 코드 

}
