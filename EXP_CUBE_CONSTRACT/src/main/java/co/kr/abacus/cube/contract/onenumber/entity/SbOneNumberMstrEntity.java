package co.kr.abacus.cube.contract.onenumber.entity;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import co.kr.abacus.cube.contract.dc.entity.DcByEntrKeyValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// 원넘버마스터
@Entity
@Table(name="TB_SB_ONE_NUMBER_MSTR")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SbOneNumberMstrEntity extends BaseEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long onenoMstrSeqno;

 // 원넘버 그룹 누적번호
 private long onenoGrpSeqno;

 private long entrNo;

}
