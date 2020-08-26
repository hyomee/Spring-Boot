package co.kr.abacus.cube.contract.dev.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class DvDevcCircMgmtValue {
	
	@Column(table="TB_DV_DEVC_CIRC_MGMT", name="CNTC_TERM_MNBR")
	private long cntcTermMnbr;
	
	@Column(table="TB_DV_DEVC_CIRC_MGMT", name="ITEM_ID")
	private long itemId;	
	

	//@CreationTimestamp
	@Column(table="TB_DV_DEVC_CIRC_MGMT", name="SYS_CREATE_DATE", nullable = false, updatable = false)
	private LocalDate sysCreateDate;

	//@UpdateTimestamp
	@Column(table="TB_DV_DEVC_CIRC_MGMT", name="SYS_UPDATE_DATE", nullable = false)
	private LocalDate sysUpdateDate;

	@Column(table="TB_DV_DEVC_CIRC_MGMT", name="OPERATOR_ID")
	private String operatorId;

	@Column(table="TB_DV_DEVC_CIRC_MGMT", name="APPLICATION_ID")
	private String applicationId;

	@Column(table="TB_DV_DEVC_CIRC_MGMT", name="DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(table="TB_DV_DEVC_CIRC_MGMT", name="DL_UPDATE_STAMP")
	private String dlUpdateStamp;
}
