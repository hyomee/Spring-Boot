package co.kr.abacus.cube.contract.mnp.entity;


import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import co.kr.abacus.cube.contract.dc.entity.DcByEntrKeyValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// 세대간 번호 이동 마스터
@Entity
@Table(name="TB_SB_INTR_GN_MNP")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbIntrGnMnpEntity extends BaseEntity {

  @EmbeddedId
  private IntrGnMnprKeyValue intrGnMnprKeyValue;

  private String mnpCtn;
}

