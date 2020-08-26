package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

// 직판대리점 꼬리표 발행
@Entity
@Table(name="TB_DV_DTSL_DLR_INFO_LIST")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvDtslDlrInfoListEntity extends BaseEntity {

  @EmbeddedId
  private DtslDlrInfoListKeyValue DtsDlrInfoListKeyValue;

  //꼬리표 발급 센터
  @Column(name="RCPT_DLR_CD")
  private String rcptDlrCd;



}
