package com.hyomee.sp.factory.enumService.service.sus.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MessageSusCdtDTO {

    private String orderId;
    private String eventCd;
    private String eventDtlCd;

    @Builder
    public MessageSusCdtDTO(String orderId, String eventCd, String eventDtlCd) {
        this.orderId = orderId;
        this.eventCd = eventCd;
        this.eventDtlCd = eventDtlCd;

    }
}