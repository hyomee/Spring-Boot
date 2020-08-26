package co.kr.abacus.cube.contract.dev.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;


@Embeddable
public class UsimByEntrKeyValue implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;


  @Column(name="ENTR_NO")
  private String entrNo;

  @Column(name="USIM_BY_ENTR_SEQNO")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long usimByEntrSeqno;

}