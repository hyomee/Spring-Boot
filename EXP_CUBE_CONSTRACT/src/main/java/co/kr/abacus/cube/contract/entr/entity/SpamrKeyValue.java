package co.kr.abacus.cube.contract.entr.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;


@Data
@Embeddable
public class SpamrKeyValue implements Serializable {

  @Column(name="ENTR_NO")
  private long entrNo;

  @Column(name="SPAM_ISOL_CD")
  private String spamIsolCd;

  @Column(name="VALD_STRT_DT")
  private Date valdStrtDt;

}