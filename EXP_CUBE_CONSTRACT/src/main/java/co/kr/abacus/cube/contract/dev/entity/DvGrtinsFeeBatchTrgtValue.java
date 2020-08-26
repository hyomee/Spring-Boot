package co.kr.abacus.cube.contract.dev.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;
import java.util.Date;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DvGrtinsFeeBatchTrgtValue {
  // 보험 관리 번호
  @Column(table="TB_DV_GRTINS_FEE_BATCH_TRGT", name="INSR_MGMT_NO")
  private String insrMgmtNo;

  // 처리일자
  @Column(table="TB_DV_GRTINS_FEE_BATCH_TRGT", name="PRSS_DT")
  private Date prssDt;

  // 보증보험료 청구 여부
  @Column(table="TB_DV_GRTINS_FEE_BATCH_TRGT", name="GRTINS_FEE_BILL_YN")
  private String grtinsFeeBillYn;


  //@CreationTimestamp
  @Column(table="TB_DV_GRTINS_FEE_BATCH_TRGT", name="SYS_CREATE_DATE", nullable = false, updatable = false)
  private LocalDate sysCreateDate;

  //@UpdateTimestamp
  @Column(table="TB_DV_GRTINS_FEE_BATCH_TRGT", name="SYS_UPDATE_DATE", nullable = false)
  private LocalDate sysUpdateDate;

  @Column(table="TB_DV_GRTINS_FEE_BATCH_TRGT", name="OPERATOR_ID")
  private String operatorId;

  @Column(table="TB_DV_GRTINS_FEE_BATCH_TRGT", name="APPLICATION_ID")
  private String applicationId;

  @Column(table="TB_DV_GRTINS_FEE_BATCH_TRGT", name="DL_SERVICE_CODE")
  private String dlServiceCode;

  @Column(table="TB_DV_GRTINS_FEE_BATCH_TRGT", name="DL_UPDATE_STAMP")
  private String dlUpdateStamp;
}
