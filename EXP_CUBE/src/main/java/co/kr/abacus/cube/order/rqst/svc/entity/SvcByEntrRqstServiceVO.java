package co.kr.abacus.cube.order.rqst.svc.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrRqstServiceVO {
	
	@Column(name="PROD_CD")
	private String prodCd;
}
