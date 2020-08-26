package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

// 제휴사 쿠폰 결제 살세
@Entity
@Table(name="TB_DV_JNCO_CPN_STLM_D")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvJncoCpStlmDEntity extends BaseEntity {

  @EmbeddedId
  private JncoCpnStlmDKeyValue jncoCpnStlmDKeyValue;

  // 제휴사 쿠폰 결제 상태 코드
  private String jncoCpnStlmStusCd;

  // 제휴사 쿠폰 금액
  private long jncoCpnAmt;
}
