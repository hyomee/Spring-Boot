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

// 은행별 쿠폰 할인 
@Entity
@Table(name="TB_DV_BNK_CPN_DSCNT")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class DvBnkCpnDscntEntity extends BaseEntity {
	
	// 은향 코드, 은행 쿠폰 코드 
	@EmbeddedId
	private BnkCpnDscntKeyValue  bnkCpnDscntKeyValue;

	
	// 가입번호 
	@Column(name="ENTR_NO")
	private String entrNo;
	
	// 고객번호
	// 단말기 판매 누적 번호 
	// 쿠폰금액
	// 처리일자 
	// 종료일자 
		
	
}
