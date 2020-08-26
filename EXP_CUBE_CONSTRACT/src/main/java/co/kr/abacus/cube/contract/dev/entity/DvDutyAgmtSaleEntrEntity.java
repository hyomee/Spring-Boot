package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

// 의무 약정 판매 가입
@Entity
@Table(name="TB_DV_DUTY_AGMT_SALE_ENTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvDutyAgmtSaleEntrEntity extends BaseEntity {

  @EmbeddedId
  private DutyAgntSakeEntrKeyValue dutyAgntSakeEntrKeyValue;

  // 단말 모델 코드
  @Column(name="ITEM_ID")
  private String itemId;


}
