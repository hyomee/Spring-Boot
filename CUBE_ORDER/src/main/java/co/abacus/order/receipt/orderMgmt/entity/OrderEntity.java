package co.abacus.order.receipt.orderMgmt.entity;


import co.abacus.order.common.dto.ControlFieldDTO;
import co.abacus.order.common.entity.ControlFieldVO;
import co.abacus.order.common.utils.JpaJsonConverter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.*;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 모바일 서비스 주문 관리
 * - 모든 서비스에 대한 주문번호 발행
 */
@Entity
@Table(name="TB_SB_ORDE_MGMT")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class OrderEntity extends ControlFieldVO {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  // 주문 번호
  private long oderNumber;

  @Setter
  @Embedded
  private OrderEventVO orderEventVO;

  @Setter
  @Embedded
  private OrderContractVO orderContractVO;

  @Setter
  //@Convert(converter = JpaJsonConverter.class)
  @Column(name="REQUEST_DATA", columnDefinition = "text")
  private String requestObj ;

/*  @Convert(converter = HashMapConverter.class)
  private Map<String, Object> customerAttributes;

  @NonNull
  private  JSONObject  jsonData;
}*/



}
