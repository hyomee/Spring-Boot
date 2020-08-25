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
public class EntrRqstSendIcallVO {
	// 발신금지여부 
	@Column(name="SEND_PHB_YN")
	private String sendPhbYn;
	
	// 착신금지여부 
	@Column(name="ICALL_PHB_YN")
	private String icallPhbYn;
}
