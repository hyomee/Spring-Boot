package co.kr.abacus.cube.order.receipt.orderMgmt.entity;

import co.kr.abacus.cube.order.receipt.orderMgmt.enums.EventCode;
import co.kr.abacus.cube.order.receipt.orderMgmt.enums.EventDetailCode;
import lombok.*;
import lombok.extern.slf4j.Slf4j;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Slf4j
@Embeddable
@Getter
public class OrderEventVO {

  // 이벤트 코드

  @Column(name="EVENT_CD")
  @Enumerated(EnumType.STRING)
  private EventCode eventCode;

  // 이벤트 상세 코드
  @Column(name="EVENT_DTL_CD")
  @Enumerated(EnumType.STRING)
  private EventDetailCode eventDetailCode;

  @Builder
  public OrderEventVO() {

  }

  public boolean setEventAndEventDetail(String eventCode, String eventDetailCode) {
    boolean rn = true;
    log.debug("eventCode ====" + eventCode);
    switch (eventCode) {
      case "NAC":
        this.eventCode = EventCode.NAC;
        if (!setEventDetailCode(eventDetailCode)) {
          rn = false;
        };
        break;
      default:
        rn = false;
    }
    return rn;
  }

  private boolean setEventDetailCode(String eventDetailCode) {
    boolean rn = true;
    log.debug("eventDetailCode ====" + eventDetailCode);
    switch (eventDetailCode) {
      case "NAC":
        this.eventDetailCode = EventDetailCode.NAC;
        break;
      default:
        rn = false;
    }
    return rn;
  }



}
