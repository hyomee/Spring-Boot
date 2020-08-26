package co.kr.abacus.cube.contract.dev.entity;


import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_DV_USIM_BY_ENTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvUsimByEntrEntity extends BaseEntity {

  @EmbeddedId
  private UsimByEntrKeyValue usimByEntrKeyValue;

  private String iccidNo;
}
