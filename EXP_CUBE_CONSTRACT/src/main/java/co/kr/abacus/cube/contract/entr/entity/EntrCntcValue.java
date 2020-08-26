package co.kr.abacus.cube.contract.entr.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

@Embeddable
public class EntrCntcValue {
	
	@Column(table="TB_SB_ENTR_CNTC", name="ENTR_NO", nullable = false, length = 12 )
	@NotNull
	private long entrNo;
	
	@Column(table="TB_SB_ENTR_CNTC",name="HLDR_CUST_NO", nullable = false )
	@NotNull
	private long hldrCustNo;
	
	@Column(table="TB_SB_ENTR_CNTC", name="billAcntNo", nullable = false )
	@NotNull
	private long billAcntNo;
	
	@Column(table="TB_SB_ENTR_CNTC", name="LTPYM_STTS_CD")
	private char ltpymSttsCd;
	
	
}
