package co.kr.abacus.cube.order.receipt.orderMgmt.dto;

import co.kr.abacus.cube.order.common.dto.ControlFieldDTO;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class OrderDTO extends ControlFieldDTO {

  private long oderNumber;
  private String eventCode;
  private String eventDetailCode;

  private String entrNo;
  private String aceno;
  private String billAcntNo;
  private String hldrCustNo;
  private String prodNo;







}
