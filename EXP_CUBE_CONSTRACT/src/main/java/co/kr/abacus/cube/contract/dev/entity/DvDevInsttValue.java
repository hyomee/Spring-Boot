package co.kr.abacus.cube.contract.dev.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


// 단말 할부 
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DvDevInsttValue {
	
	@Column(table="TB_DV_DEV_INSTT", name="ETBY_DEVC_SEQNO")
	private String etbyDevcSeqno;
	
	@Column(table="TB_DV_DEV_INSTT", name="INSR_MGMT_NO")
	private long insrMgmtNo;	
	

	//@CreationTimestamp
	@Column(table="TB_DV_DEV_INSTT", name="SYS_CREATE_DATE", nullable = false, updatable = false)
	private LocalDate sysCreateDate;

	//@UpdateTimestamp
	@Column(table="TB_DV_DEV_INSTT", name="SYS_UPDATE_DATE", nullable = false)
	private LocalDate sysUpdateDate;

	@Column(table="TB_DV_DEV_INSTT", name="OPERATOR_ID")
	private String operatorId;

	@Column(table="TB_DV_DEV_INSTT", name="APPLICATION_ID")
	private String applicationId;

	@Column(table="TB_DV_DEV_INSTT", name="DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(table="TB_DV_DEV_INSTT", name="DL_UPDATE_STAMP")
	private String dlUpdateStamp;
}
