package co.kr.abacus.cube.order.rqst.entr.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EntrRqstServiceVO {

	@Column(name="SVCGRP_CD")
	private String svcgrpCd;
	
	@Column(name="PROD_CD")
	private String prodCd;
}
