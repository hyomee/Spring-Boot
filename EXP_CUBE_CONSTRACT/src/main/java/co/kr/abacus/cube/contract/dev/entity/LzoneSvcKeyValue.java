package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Embeddable
public class LzoneSvcKeyValue implements Serializable {

  // 가입번호
  @Column(name="ENTR_NO")
  private long entrNo;

  // 기분존 서비스 등록 누적번호
  @Column(name="LZONE_SVC_RGST_SEQNO")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long lzoneSvcRqstSeqno;

}
