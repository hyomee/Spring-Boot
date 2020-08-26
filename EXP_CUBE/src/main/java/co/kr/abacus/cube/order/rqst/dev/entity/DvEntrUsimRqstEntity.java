package co.kr.abacus.cube.order.rqst.dev.entity;

import co.kr.abacus.cube.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// 단말 usim 신청부
@Entity
@Table(name="TB_DV_ENTR_USIM_RQST")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvEntrUsimRqstEntity extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ENTR_USIM_RQST_SEQNO")
  private long entrUsimRqstSeqno;

  private long entrNo;
  private long usimByEntrSeqno;
  private long entrRqstNo;
  private String iccidNo;
  private String usimMdlCd;

}

