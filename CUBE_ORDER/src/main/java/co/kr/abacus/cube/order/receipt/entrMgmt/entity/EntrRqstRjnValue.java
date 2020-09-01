package co.kr.abacus.cube.order.receipt.entrMgmt.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EntrRqstRjnValue {

	
	// 재가입 일시 
	@Column(name="RJN_DTTM")
	private Date Rjnttm;
	
	// 재가입 여부 
	@Column(name="RJN_YN")
	private String rjnYn;
	
}
