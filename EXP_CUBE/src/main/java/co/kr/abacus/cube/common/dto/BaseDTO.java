package co.kr.abacus.cube.common.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BaseDTO {

	
	private LocalDate sysCreateDate;

	private LocalDate sysUpdateDate;

	private String operatorId;

	private String applicationId;

	private String dlServiceCode;

	private String dlUpdateStamp;
	
}
