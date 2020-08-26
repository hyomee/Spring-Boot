package co.kr.abacus.cube.contract.onenumber.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// 원넘버 요청 정보
@Entity
@Table(name="TB_SB_ONE_NUMBER_REQ_INFO")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbOneNumberReqInfoEntity extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long onenReqstSeqno;

  private long entrNo;



}