package co.kr.abacus.cube.contract.dev.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DvDevSaleDtlValue {
	
	@Column(table="TB_DV_DEV_SALE_DTL", name="DEV_DSCNT_AMT")
	private long devDscntAmt;
	
	@Column(table="TB_DV_DEV_SALE_DTL", name="PNLT_PBP_AMT")
	private long pnltPbpAmt;	
	

	//@CreationTimestamp
	@Column(table="TB_DV_DEV_SALE_DTL", name="SYS_CREATE_DATE", nullable = false, updatable = false)
	private LocalDate sysCreateDate;

	//@UpdateTimestamp
	@Column(table="TB_DV_DEV_SALE_DTL", name="SYS_UPDATE_DATE", nullable = false)
	private LocalDate sysUpdateDate;

	@Column(table="TB_DV_DEV_SALE_DTL", name="OPERATOR_ID")
	private String operatorId;

	@Column(table="TB_DV_DEV_SALE_DTL", name="APPLICATION_ID")
	private String applicationId;

	@Column(table="TB_DV_DEV_SALE_DTL", name="DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(table="TB_DV_DEV_SALE_DTL", name="DL_UPDATE_STAMP")
	private String dlUpdateStamp;
}
