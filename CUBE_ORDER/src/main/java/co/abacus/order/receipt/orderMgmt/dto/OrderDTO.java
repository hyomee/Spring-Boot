package co.abacus.order.receipt.orderMgmt.dto;

import co.abacus.order.common.dto.ControlFieldDTO;
import lombok.*;

import javax.persistence.Column;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
