package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

// 기분존 서비스
@Entity
@Table(name="TB_DV_LZONE_SVC")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvLzoneSvcEntity extends BaseEntity {

  @EmbeddedId
  private LzoneSvcKeyValue lzoneSvcKeyValue;

  // 부가장치판매번호
  @Column(name = "ADDEV_SALE_NO")
  private long addevSaleNo;

  // dmid
  private String dmId;
}
