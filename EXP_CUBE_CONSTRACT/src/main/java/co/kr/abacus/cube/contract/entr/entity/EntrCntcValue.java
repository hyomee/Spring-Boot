package co.kr.abacus.cube.contract.entr.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

import java.time.LocalDate;

@Embeddable
public class EntrCntcValue {
	
	@Column(table="TB_SB_ENTR_CNTC", name="ENTR_NO", nullable = false, length = 12 )
	@NotNull
	private long entrNo;
	
	@Column(table="TB_SB_ENTR_CNTC", name="HLDR_CUST_NO", nullable = false )
	@NotNull
	private long hldrCustNo;
	
	@Column(table="TB_SB_ENTR_CNTC", name="BILL_ACNT_NO", nullable = false )
	@NotNull
	private long billAcntNo;
	
	@Column(table="TB_SB_ENTR_CNTC", name="LTPYM_STTS_CD")
	private char ltpymSttsCd;

	//@CreationTimestamp
	@Column(table="TB_SB_ENTR_CNTC", name="SYS_CREATE_DATE", nullable = false, updatable = false)
	private LocalDate sysCreateDate;

	//@UpdateTimestamp
	@Column(table="TB_SB_ENTR_CNTC", name="SYS_UPDATE_DATE", nullable = false)
	private LocalDate sysUpdateDate;

	@Column(table="TB_SB_ENTR_CNTC", name="OPERATOR_ID")
	private String operatorId;

	@Column(table="TB_SB_ENTR_CNTC", name="APPLICATION_ID")
	private String applicationId;

	@Column(table="TB_SB_ENTR_CNTC", name="DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(table="TB_SB_ENTR_CNTC", name="DL_UPDATE_STAMP")
	private String dlUpdateStamp;
	
	
}
