package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class JncoCpnStlmDKeyValue implements Serializable {

  // 가입번호
  @Column(name="ENTR_NO")
  private long entrNo;

  // 단말기 판매 누적번호
  @Column(name="DVIC_SALE_SEQNO")
  private long dvicSaleSeqno;

  // 제휴사 코드
  @Column(name="JNCO_CD")
  private String jncoCd;

  // 제휴사 쿠폰 번호
  @Column(name="JNCO_CPN_NO")
  private String jncoCpnNo;

}
