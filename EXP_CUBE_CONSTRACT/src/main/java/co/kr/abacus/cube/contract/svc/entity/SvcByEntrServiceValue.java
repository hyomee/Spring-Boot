package co.kr.abacus.cube.contract.svc.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrServiceValue {
	@Column(name="PROD_CD")
	private String prodCd;
}

