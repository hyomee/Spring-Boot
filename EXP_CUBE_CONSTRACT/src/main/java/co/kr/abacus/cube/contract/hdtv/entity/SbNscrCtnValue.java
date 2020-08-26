package co.kr.abacus.cube.contract.hdtv.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Table(name="TB_SB_NSCR_CTN")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbNscrCtnValue extends BaseEntity {
	
	// 가입 번호 
	@Column(name="ENTR_NO")
	private long entrNo;
	
	// 휴대폰 번호 
	@Column(name="CTN")
	private long ctn;
	
	// 자사여부 
	@Column(name="ORCMP_YN")
	private long orcmpYn;
	
	// 인증 구분 코드 
	@Column(name="AUTN_DV_CD")
	private long authDvCd;
	
	// 서비스 상태 코드 
	@Column(name="PROD_STTS_CD")
	private long prodSttsCd;
	
}
