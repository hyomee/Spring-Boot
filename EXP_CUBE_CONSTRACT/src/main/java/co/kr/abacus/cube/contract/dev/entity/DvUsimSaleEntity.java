package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_DV_USIM_SALE")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvUsimSaleEntity extends BaseEntity {

  @EmbeddedId
  private UsimSaleKeyValue usimSaleKeyValue;

  private String iccidNo;
}
