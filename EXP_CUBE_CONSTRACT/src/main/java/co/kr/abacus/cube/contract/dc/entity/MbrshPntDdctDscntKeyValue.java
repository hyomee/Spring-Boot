package co.kr.abacus.cube.contract.dc.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
@Embeddable
public class MbrshPntDdctDscntKeyValue implements Serializable {

  @Column(name="ENTR_NO")
  private long entrNo;

  @Column(name="SEQNO")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long Seqno;

}

