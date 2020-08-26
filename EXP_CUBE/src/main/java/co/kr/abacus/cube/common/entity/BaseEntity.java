package co.kr.abacus.cube.common.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@EqualsAndHashCode
@MappedSuperclass
public class BaseEntity {


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
	private String dlUpdateStamp;
}
