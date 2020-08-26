package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

// USIM 기변 이력
@Entity
@Table(name="TB_DV_USIM_DEV_CHG_HIST")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvUsimDevChgHistEntity extends BaseEntity {

  @EmbeddedId
  private UsimDevChgHistKeyValue usimevChgHistKeyValue;

  private String imsiNo;


}
