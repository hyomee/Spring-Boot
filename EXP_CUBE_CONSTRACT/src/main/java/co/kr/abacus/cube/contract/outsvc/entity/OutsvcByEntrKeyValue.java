package co.kr.abacus.cube.contract.outsvc.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;


@Data
@Embeddable
public class OutsvcByEntrKeyValue implements Serializable {

  @Column(name="ENTR_NO")
  private long entrNo;

  // 제휴 기관 코드
  @Column(name="CPRT_ORG_CD")
  private long cprtOrgCd;

  // 가입별 외부 서비스 누적번호
  @Column(name="ENTR_BY_OUTS_SVC_SEQNO")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long entrByOutsSvcSeqno;
}

