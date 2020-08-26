package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

// S클럽 가입
@Entity
@Table(name="TB_DV_SCLUB_ENTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvSclubEntrEntity extends BaseEntity {

  @EmbeddedId
  private SclubEntrKeyValue sclubEntrKeyValue;

  private String itemId;

  private String manfSerialNo;

  

}
