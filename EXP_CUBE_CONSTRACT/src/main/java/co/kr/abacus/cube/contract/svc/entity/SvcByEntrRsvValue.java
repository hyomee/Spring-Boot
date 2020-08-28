package co.kr.abacus.cube.contract.svc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrRsvValue {
	// 예약 종료 여부 
	@Column(name="RSV_END_YN")
	private String rsvEndYn;
	
	// 예약 종료 일자 
	@Column(name="RSV_END_DT")
	private Date rsvEndDt;
}
