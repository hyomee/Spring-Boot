package co.kr.abacus.cube.order.receipt.orderMgmt.dto;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import lombok.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class OrderResponseDTO {

  private HashMap requestObj;

  private long oderNumber;
  private String eventCode;
  private String eventDetailCode;

  private String entrNo;
  private String aceno;
  private String billAcntNo;
  private String hldrCustNo;
  private String prodNo;


}
