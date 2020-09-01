package co.abacus.order.receipt.orderMgmt.entity;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.abacus.order.common.entity.ControlFieldVO;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
  //@Convert(converter = JpaGsonConverter.class)
  @Column(name="REQUEST_DATA", columnDefinition = "text")
  private String requestObj ;

/*  @Convert(converter = HashMapConverter.class)
  private Map<String, Object> customerAttributes;

  @NonNull
  private  JSONObject  jsonData;
}*/



}
