package co.abacus.order.common.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * 테이블의 제어 필드 
 * @author ASUS
 *
 */
@Getter
@EqualsAndHashCode
@MappedSuperclass
public class ControlFieldVO {
	
	@Column(name="SYS_CREATE_DATE", nullable = false, updatable = false)
	private LocalDate sysCreateDate;

	@Column(name="SYS_UPDATE_DATE", nullable = false)
	private LocalDate sysUpdateDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	@Column(name="APPLICATION_ID")
	private String applicationId;

	@Column(name="DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(name="DL_UPDATE_STAMP")
	private Integer dlUpdateStamp;

	public void setControlFieldVO(LocalDate sysCreateDate,
																LocalDate sysUpdateDate,
																String operatorId,
																String applicationId,
																String dlServiceCode,
																Integer dlUpdateStamp) {
		this.sysCreateDate = sysCreateDate;
		this.sysUpdateDate = sysUpdateDate;
		this.operatorId = operatorId;
		this.applicationId =  applicationId;
		this.dlServiceCode =  dlServiceCode;
		this.dlUpdateStamp =  dlUpdateStamp;

	}
}
