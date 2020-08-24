package co.kr.abacus.cube.order.rqst.entr.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EntrRqstRjnVO {

	
	// 재가입 일시 
	@Column(name="RJN_DTTM")
	private Date Rjnttm;
	
	// 재가입 여부 
	@Column(name="RJN_YN")
	private String rjnYn;
	
}
