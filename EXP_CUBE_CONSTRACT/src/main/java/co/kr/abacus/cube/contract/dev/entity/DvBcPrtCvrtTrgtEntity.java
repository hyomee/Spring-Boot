package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

// BC 포인트 리 전환 대상
@Entity
@Table(name="TB_DV_BC_PRT_CVRT_TRGT")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class DvBcPrtCvrtTrgtEntity extends BaseEntity {
	
	// 등록 일자 , 가입번호, 카드 발급 주민 번호
	@EmbeddedId
	private BcPrtCvrtTrgtKeyValue  bcPrtCvrtTrgtKeyValue;
	
	// 대리점 코드
	@Column(name="DLR_CD")
	private String dltCd;
	
	// BC 카드 발급 상태 코드
	// 포인트리 SMS 처리 결과 코드 
	// 납부 방법 상세 코드
}
