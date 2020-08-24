package co.kr.abacus.cube.order.rqst.entr.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EntrRqstChngNumberVO {
	
	// 번호변경 전 상품번호
	@Column(name="CHNG_BFR_PROD_NO")
	private String chngBfrProdNo;
	
	// 번호변경  후  상품번호
	@Column(name="CHNG_AFR_PROD_NO")
	private String chngAfrProdNo;
	
}
