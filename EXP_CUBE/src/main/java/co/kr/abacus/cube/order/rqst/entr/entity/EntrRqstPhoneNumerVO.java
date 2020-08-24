package co.kr.abacus.cube.order.rqst.entr.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EntrRqstPhoneNumerVO {
		
	// 전화 번호 
	@Column(name="PROD_NO")
	private String prodNo;
	
	// 가상번호 
	@Column(name="VT_NO")
	private String vtNo;
	
	// IMS번호 
	@Column(name="IMSI_NO")
	private String imsiNo;
	
	// MIN번호 
	@Column(name="MIN_NO")
	private String minNo;
		
	// MIC번호
	@Column(name="MIC_NO")
	private String micNo;

	
}
