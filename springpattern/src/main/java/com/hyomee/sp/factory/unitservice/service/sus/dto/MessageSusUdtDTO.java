package com.hyomee.sp.factory.unitservice.service.sus.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MessageSusUdtDTO {

    private String orderId;
    private String eventCd;
    private String eventDtlCd;

    @Builder
    public MessageSusUdtDTO(String orderId, String eventCd, String eventDtlCd) {
        this.orderId = orderId;
        this.eventCd = eventCd;
        this.eventDtlCd = eventDtlCd;

    }
}