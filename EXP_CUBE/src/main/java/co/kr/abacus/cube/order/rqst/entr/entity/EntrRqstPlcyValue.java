package co.kr.abacus.cube.order.rqst.entr.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EntrRqstPlcyValue {

	// 가입 유형 코드 
	@Column(name="ENTR_KD_CD")
	private String entrKdCd;
	
	// 가입영업정책코드
	@Column(name="ENTR_BIZ_PLCY_CD")
	private String entrBizPlcyCd;
	
	// 최초영업정책그룹코드
	@Column(name="ENTR_BIZ_PLCY_GRP_CD")
	private String entrBizPlcyGrpCd;
	
	// 최초영업정책레벨코드
	@Column(name="ENTR_BIZ_PLCY_LVL_CD")
	private String entrBizPlcyLvlCd;
	
	// 최초영업정책적용시작일자 
	@Column(name="ENTR_BIZ_PLCY_APLY_STRT_DTTM")
	private Date entrBizPlcyAplyStrtDttm;
	
	// 최초영업정책변경일자 
	@Column(name="ENTR_BIZ_PLCY_CHNG_DTTM")
	private Date entrBizPlcyChngDttm;
	
	
	
	
}
