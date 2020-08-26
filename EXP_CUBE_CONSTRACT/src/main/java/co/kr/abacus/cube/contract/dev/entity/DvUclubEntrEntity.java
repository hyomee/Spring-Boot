package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

// U클럽 가입
@Entity
@Table(name="TB_DV_UCLUB_ENTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvUclubEntrEntity extends BaseEntity {

  @EmbeddedId
  private UclubEntrKeyValue uclubEntrKeyValue;

  private String itemId;

  private String manfSerialNo;

}
