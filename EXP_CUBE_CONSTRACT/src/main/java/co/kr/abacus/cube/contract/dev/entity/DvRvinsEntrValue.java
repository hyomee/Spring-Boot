package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="TB_DV_RVINS_ENTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvRvinsEntrValue extends BaseEntity {

  // 단말기 모델 코드
  @Column(name = "ITEM_ID")
  private String itemId;
}
