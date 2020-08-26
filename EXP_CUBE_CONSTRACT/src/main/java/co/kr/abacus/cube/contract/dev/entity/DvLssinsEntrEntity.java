package co.kr.abacus.cube.contract.dev.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

// 분실보험가입
@Entity
@Table(name="TB_DV_LSSINS_ENTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DvLssinsEntrEntity extends BaseEntity {

  @EmbeddedId
  private LessingEntrKeyValue lessingEntrKeyValue;

  //단말 모델 코드
  private String itemId;

  // 단말 분실 보험 IF 전문
  @ElementCollection(fetch = FetchType.LAZY)
  @CollectionTable(
          name = "TB_DV_LSSINS_IF_TRDT",
          joinColumns = { @JoinColumn(name = "ENTR_NO", referencedColumnName = "ENTR_NO"),
                  @JoinColumn(name = "LSSING_ENTR_SEQNO", referencedColumnName = "LSSING_ENTR_SEQNO")})
  @OrderColumn(name="IF_TRDT_SEQNO", columnDefinition="long") //IF 전문 누적번호
  private List<DvLssingIfTrdtValue> dvLssingIfTrdtValueList;



}
