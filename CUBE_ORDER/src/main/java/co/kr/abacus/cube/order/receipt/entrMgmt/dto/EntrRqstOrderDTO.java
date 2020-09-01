package co.kr.abacus.cube.order.receipt.entrMgmt.dto;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EntrRqstOrderDTO extends ControlFieldDTO {


  private long workOrdrNo;
  private String eventCode;
  private String eventDetailCode;

  private EntrRqstDTO entrRqst;

  // 신청자 정보
  private EntrApcntDTO entrApcnt;

  // 유치 정보
  private EntrRqstAtrctInfoDTO entrRqstAtrctInfo;
}