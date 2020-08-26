package co.kr.abacus.cube.contract.entr.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Table(name="TB_SB_ENTR_AGNT")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EntrAgntValue extends BaseEntity {
	
	// 대리인 유형 코드 
	@Column(name="AGNT_KD_CD")
	private String agntKdCd;
	
	// 대리인 고객 번호 
	private String agntCustNo;
	
	// 대리인 유효 시작 일자 
	private Date agntValdStrtDt;
	
	// 대리인 유효 종료 일자 
	private Date agntValdEndDt;
	
	// 대표법정대리인여부
	private String repAgntYn;
	
	// SMS거부여뷰
	private String smsDenyYn;
	
	
}
