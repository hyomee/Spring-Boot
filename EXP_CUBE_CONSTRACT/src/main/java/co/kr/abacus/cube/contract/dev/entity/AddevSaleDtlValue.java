package co.kr.abacus.cube.contract.dev.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.sun.istack.NotNull;

@Embeddable
public class AddevSaleDtlValue {
	
	// 부가장치 할부 상태 코드 
	@Column(table="TB_DV_ADDEV_SALE_DTL", name="ADDEV_INSTT_STTS_CD" )
	@NotNull
	private long addevInsttSttsCd;
	
	
	//@CreationTimestamp
	@Column(table="TB_DV_ADDEV_SALE_DTL", name="SYS_CREATE_DATE", nullable = false, updatable = false)
	private LocalDate sysCreateDate;

	//@UpdateTimestamp
	@Column(table="TB_DV_ADDEV_SALE_DTL", name="SYS_UPDATE_DATE", nullable = false)
	private LocalDate sysUpdateDate;

	@Column(table="TB_DV_ADDEV_SALE_DTL", name="OPERATOR_ID")
	private String operatorId;

	@Column(table="TB_DV_ADDEV_SALE_DTL", name="APPLICATION_ID")
	private String applicationId;

	@Column(table="TB_DV_ADDEV_SALE_DTL", name="DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(table="TB_DV_ADDEV_SALE_DTL", name="DL_UPDATE_STAMP")
		private String dlUpdateStamp;
	
	
}
