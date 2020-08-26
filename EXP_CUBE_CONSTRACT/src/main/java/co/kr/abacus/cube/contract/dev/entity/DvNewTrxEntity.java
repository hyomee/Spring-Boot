package co.kr.abacus.cube.contract.dev.entity;

// 이벤트 영업지원정보편성

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="TB_DV_NEW_TRX")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvNewTrxEntity extends BaseEntity {

  // NEWTRX 누적번호
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="NEW_TRX_SEQNO")
  private long newTrxSeqno;

  // 가입번호
  private long entrNo;

  // 상품코드
  private String prodCd;

  // NEWTRX 이벤트 코드
  private String newTrxEventCd;

  // NEWTRX 이벤트 사유 코드
  private String newTrxEventRsnCd;
}
