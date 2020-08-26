package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Embeddable
public class LessingEntrKeyValue implements Serializable {

  // 가입번호
  @Column(name="ENTR_NO")
  private long entrNo;

  // 분실보험가입누적번호
  @Column(name = "LSSING_ENTR_SEQNO")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long lssingEntrSeqno;

}
