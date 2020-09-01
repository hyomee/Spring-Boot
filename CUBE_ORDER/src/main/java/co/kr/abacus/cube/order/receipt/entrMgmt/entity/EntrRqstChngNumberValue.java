package co.kr.abacus.cube.order.receipt.entrMgmt.entity;

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
public class EntrRqstChngNumberValue {
	
	// 번호변경 전 상품번호
	@Column(name="CHNG_BFR_PROD_NO")
	private String chngBfrProdNo;
	
	// 번호변경  후  상품번호
	@Column(name="CHNG_AFR_PROD_NO")
	private String chngAfrProdNo;
	
}
