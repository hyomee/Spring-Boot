package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Embeddable
public class SclubEntrKeyValue implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name="ENTR_NO")
  private long entrNo;

  @Column(name="DEV_SALE_SEQNO")
  private long devSaleSeqno;

  @Column(name="CLUB_DV_CD")
  private String clubDvCd;

  @Column(name="ENTR_SEQNO")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long entrSeqNo;

}
