package co.kr.abacus.cube.contract.dev.entity;


import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.util.Date;

@Embeddable
@Table(name="TB_DV_CHRG_PYM")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvLssingIfTrdtValue extends BaseEntity {

  // 처리일자
  private Date PrssDt;
}
