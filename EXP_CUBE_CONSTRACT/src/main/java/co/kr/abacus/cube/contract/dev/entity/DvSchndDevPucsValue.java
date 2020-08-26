package co.kr.abacus.cube.contract.dev.entity;

// 중고 단말기 매입

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="TB_DV_SCHND_DEV_PUCS")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvSchndDevPucsValue extends BaseEntity {

  // 가입별 단말기 누적번호
  @Column(name = "DEV_BY_ENTR_SEQNO")
  private long devByEntrSeqno;
}