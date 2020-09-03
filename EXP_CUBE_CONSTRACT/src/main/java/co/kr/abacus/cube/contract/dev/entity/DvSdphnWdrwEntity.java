package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// 중고폰 회수 
@Entity
@Table(name="TB_DV_SDPHN_WDRW")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvSdphnWdrwEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "SDPHN_WDRW_SEQNO")
  private long sdphnWdrwSeqno;

  private String itemId;
}
