package com.hyomee.sp.factory.unitservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class NuomResultDTO {

    private String orderId;
    private String eventCd;
    private String eventDtlCd;
    private String messageCode;
    private String orderStatus;

    @Builder
    public NuomResultDTO(String orderId, String eventCd, String eventDtlCd, String messageCode, String orderStatus) {
        this.orderId = orderId;
        this.eventCd = eventCd;
        this.eventDtlCd = eventDtlCd;
        this.messageCode = messageCode;
        this.orderStatus = orderStatus;

    }
}