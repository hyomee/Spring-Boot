package co.kr.abacus.cube.order.rqst.entr.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EntrRqstRjnVO {

	
	// 재가입 일시 
	@Column(name="RJN_DTTM")
	private Date Rjnttm;
	
	// 재가입 여부 
	@Column(name="RJN_YN")
	private String rjnYn;
	
}
