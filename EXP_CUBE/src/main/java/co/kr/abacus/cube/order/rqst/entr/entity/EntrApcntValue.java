package co.kr.abacus.cube.order.rqst.entr.entity;

import java.time.LocalDate;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 가입신청자
 * @author meeyoun
 *
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EntrApcntValue  {
		
	// 신청자 명 
	@Column(table="TB_SB_ENTR_APCNT")
	private String apcntNm;
	
	// 신청자 자택 번호 
	@Column(table="TB_SB_ENTR_APCNT")
	private String apcntHomeTelno;
	
	
	//@CreationTimestamp
	@Column(table="TB_SB_ENTR_APCNT", name="SYS_CREATE_DATE", nullable = false, updatable = false)
	private LocalDate sysCreateDate;

	//@UpdateTimestamp
	@Column(table="TB_SB_ENTR_APCNT", name="SYS_UPDATE_DATE", nullable = false)
	private LocalDate sysUpdateDate;

	@Column(table="TB_SB_ENTR_APCNT", name="OPERATOR_ID")
	private String operatorId;

	@Column(table="TB_SB_ENTR_APCNT", name="APPLICATION_ID")
	private String applicationId;

	@Column(table="TB_SB_ENTR_APCNT", name="DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(table="TB_SB_ENTR_APCNT", name="DL_UPDATE_STAMP")
	private String dlUpdateStamp;

}
