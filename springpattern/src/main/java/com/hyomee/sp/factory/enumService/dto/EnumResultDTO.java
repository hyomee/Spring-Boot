package com.hyomee.sp.factory.enumService.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EnumResultDTO {

    private String orderId;
    private String eventCd;
    private String eventDtlCd;
    private String messageCode;
    private String orderStatus;

    @Builder
    public EnumResultDTO(String orderId, String eventCd, String eventDtlCd, String messageCode, String orderStatus) {
        this.orderId = orderId;
        this.eventCd = eventCd;
        this.eventDtlCd = eventDtlCd;
        this.messageCode = messageCode;
        this.orderStatus = orderStatus;

    }
}
