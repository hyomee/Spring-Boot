package co.kr.abacus.cube.order.rqst.svc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrRqstRtngVO {
	
	// 과금 시작 일시 
	@Column(name="RTNG_STRT_DTTM")
	private Date rtngStrtDttm;
	
	// 과금 종료 일시 
	@Column(name="RTNG_End_DTTM")
	private Date rtngEndDttm;
	
	
}
