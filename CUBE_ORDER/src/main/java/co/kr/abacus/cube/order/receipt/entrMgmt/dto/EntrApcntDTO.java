package co.kr.abacus.cube.order.receipt.entrMgmt.dto;

import lombok.*;

import javax.persistence.Column;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EntrApcntDTO {

  // 신청자 명
  private String apcntNm;

  // 신청자 자택 번호
  private String apcntHomeTelno;
}
