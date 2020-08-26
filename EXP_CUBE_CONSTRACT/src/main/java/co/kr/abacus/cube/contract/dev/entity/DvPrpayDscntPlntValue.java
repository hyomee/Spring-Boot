package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.naming.Name;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.util.Date;

@Embeddable
@Table(name="TB_DV_INSTT_RATE_FRP_IF")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvPrpayDscntPlntValue extends BaseEntity {

  @Column(name = "ACENO")
  private long aceno;

  @Column(name = "ENTR_DTTM")
  private Date entrDttm;
}
