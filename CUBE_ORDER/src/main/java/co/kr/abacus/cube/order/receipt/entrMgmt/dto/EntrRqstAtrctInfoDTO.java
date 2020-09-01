package co.kr.abacus.cube.order.receipt.entrMgmt.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EntrRqstAtrctInfoDTO {

  // 가입대리점코드
  private String entrDlrCd;

  // 유치 통합 영업 코드
  private String atrctIntgBizCd;

}
