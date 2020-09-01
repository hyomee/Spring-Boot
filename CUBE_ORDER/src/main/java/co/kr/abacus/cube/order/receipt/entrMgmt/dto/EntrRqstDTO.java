package co.kr.abacus.cube.order.receipt.entrMgmt.dto;

import lombok.*;

import javax.persistence.Column;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EntrRqstDTO {

  private long entrRqstNo;
  private long workOrdrNo;

  private String svcgrpCd;
  private String prodCd;

  private String entrNo;
  private String aceno;
  private String billAcntNo;

  private String prodNo;

  private String prgrsSttsCd;

}
