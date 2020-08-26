package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

// 중고 단말기 선납
@Embeddable
@Table(name="TB_DV_SCHND_DEV_PRPAY")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvSchndDevPrpayValue extends BaseEntity {

  // 가입별 단말기 누적번호
  @Column(name = "DEV_BY_ENTR_SEQNO")
  private long devByEntrSeqno;


}
