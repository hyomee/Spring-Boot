package co.kr.abacus.cube.contract.dc.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TB_SB_MBRSH_PNT_DDCT_DSCNT")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbMbrshPntDdctDscntEntity extends BaseEntity {

  @EmbeddedId
  private MbrshPntDdctDscntKeyValue mbrshPntDdctDscntKeyValue;

  // 작업 처리 일시
  private String wkpsDttm;

}
