package co.kr.abacus.cube.contract.entr.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import co.kr.abacus.cube.contract.dc.entity.DcByEntrKeyValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

// 스펨 거부 대상
@Entity
@Table(name="TB_SB_SPAM")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbSpamEntity extends BaseEntity {

  @EmbeddedId
  private SpamrKeyValue spamrKeyValue;
  private Date valdEndDt;
}