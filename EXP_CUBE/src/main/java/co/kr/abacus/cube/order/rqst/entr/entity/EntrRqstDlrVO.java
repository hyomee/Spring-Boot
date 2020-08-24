package co.kr.abacus.cube.order.rqst.entr.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EntrRqstDlrVO {
	
	// 마켓코드 
	@Column(name="MRKT_CD")
	private String mrktCd;
	
	// 가입 대리점 
	@Column(name="ENTR_DLR_CD")
	private String entrDlrCd;
	
	// 법인 솔류션 코드 
	@Column(name="SLTN")
	private String SLTN;
	
	// 최초 신정차 ID 
	@Column(name="FRST_APCNT_ID")
	private String frstApcntId;
	
	
	// 대리점 전용 1
	@Column(name="DLR_EXCLV_INF01")
	private String dlrExclvInf01;
	
	// 대리점 전용 2
	@Column(name="DLR_EXCLV_INF02")
	private String dlrExclvInf02;
	
	// 대리점 전용 3
	@Column(name="DLR_EXCLV_INF03")
	private String dlrExclvInf03;
	
	
	
	

}
