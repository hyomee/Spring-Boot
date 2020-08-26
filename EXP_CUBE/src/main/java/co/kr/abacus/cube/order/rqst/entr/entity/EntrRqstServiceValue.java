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
public class EntrRqstServiceValue {

	@Column(name="SVCGRP_CD")
	private String svcgrpCd;
	
	@Column(name="PROD_CD")
	private String prodCd;


}
