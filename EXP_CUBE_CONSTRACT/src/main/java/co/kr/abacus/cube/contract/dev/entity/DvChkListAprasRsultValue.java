package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


// 단말별 체크 리스트 점검 결과 
@Embeddable
@Table(name="TB_SB_ASGN_RQST_SEQNO")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvChkListAprasRsultValue extends BaseEntity {

	@Column(name="ITEM_1_ID")
	private String item1Id;
	
	@Column(name="ORD_1_CD")
	private String ord1Cd;
	
	@Column(name="RSULT_1_YN")
	private String rsult1Yn;
	
}
