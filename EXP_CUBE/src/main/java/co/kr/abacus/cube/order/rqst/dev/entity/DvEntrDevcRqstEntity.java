package co.kr.abacus.cube.order.rqst.dev.entity;

import co.kr.abacus.cube.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// 단말 신청 부
@Entity
@Table(name="TB_DV_ENTR_DEVC_RQST")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvEntrDevcRqstEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ENTR_DEVS_RQST_SEQNO")
  private long entrDevsRqstSeqno;

  private long entrNo;
  private long devByEntrSeqno;
  private long entrRqstNo;
  private String itemId;
  private String devsSttsCd;

}
