package co.kr.abacus.cube.contract.dev.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class DvSbsdPayInfoValue {

  // 단말기보조금액
  @Column(name = "DEV_TOT_HELP_AMT")
  private long devTotHelpAmt;
}
