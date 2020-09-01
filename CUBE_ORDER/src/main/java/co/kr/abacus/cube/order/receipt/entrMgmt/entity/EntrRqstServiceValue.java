package co.kr.abacus.cube.order.receipt.entrMgmt.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EntrRqstServiceValue {

	@Column(name="SVCGRP_CD")
	private String svcgrpCd;
	
	@Column(name="PROD_CD")
	private String prodCd;


	public void setEntrRqstServiceValue(String svcgrpCd, String prodCd) {
		this.svcgrpCd = svcgrpCd;
		this.prodCd = prodCd;
	}

	@Builder
	public EntrRqstServiceValue(String svcgrpCd, String prodCd) {
		this.svcgrpCd = svcgrpCd;
		this.prodCd = prodCd;
	}


}
