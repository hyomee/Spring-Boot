package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class DutyAgntSakeEntrKeyValue {

  // 가입번호
  @Column(name="ENTR_NO")
  private long entrNo;

  // 약정 펀매 순번
  @Column(name="AGMT_SALE_SEQ")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long agmtSaleSeq;

}
