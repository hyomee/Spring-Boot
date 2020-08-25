package co.kr.abacus.cube.contract.common.entity;

import java.util.Date;

import lombok.Data;

@Data
public class BaseDomain {

	private Date sysCreateDate;
	
	private Date sysUpdateDate;
	
	private String operatorId;
	
	private String applicationId;
	
	private String dlServiceCode;
	
	private String dlUpdateStamp;
}
