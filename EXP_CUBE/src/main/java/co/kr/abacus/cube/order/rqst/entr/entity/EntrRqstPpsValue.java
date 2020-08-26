package co.kr.abacus.cube.order.rqst.entr.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EntrRqstPpsValue {
	
	// 발신금지여부 
	@Column(name="PPAY_ENTR_DV_CD")
	private String ppayEntrDvCd;
	
	// 발신금지여부 
	@Column(name="PPS_ENTR_APP_ECPT_YN")
	private String ppsEntrAppfEcptYn;
	
	// 발신금지여부 
	@Column(name="PPS_ENTR_APPF_ECPT_DT")
	private String ppsEntrAppfEcptDt;

}
