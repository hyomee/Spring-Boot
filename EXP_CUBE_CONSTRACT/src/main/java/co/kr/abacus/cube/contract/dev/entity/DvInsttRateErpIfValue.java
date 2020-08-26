package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="TB_DV_INSTT_RATE_FRP_IF")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvInsttRateErpIfValue extends BaseEntity {

  // 납부 누적 번호
  private long pynSeqno;

  // ERP 납부 누적 번호
  private long erpPynSeqno;


}
