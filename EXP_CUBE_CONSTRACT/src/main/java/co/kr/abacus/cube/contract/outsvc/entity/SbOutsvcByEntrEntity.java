package co.kr.abacus.cube.contract.outsvc.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import co.kr.abacus.cube.contract.dc.entity.DcByEntrKeyValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name="TB_SB_OUTSVC_BY_ENTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbOutsvcByEntrEntity extends BaseEntity {
  @EmbeddedId
  private OutsvcByEntrKeyValue outsvcByEntrKeyValue;

  // 계약 관리 번호
  private long cntcMgmtNo;


}

