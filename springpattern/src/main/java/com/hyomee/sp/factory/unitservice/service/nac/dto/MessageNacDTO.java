package com.hyomee.sp.factory.unitservice.service.nac.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Setter
@Getter
@ToString
public class MessageNacDTO {

    private String orderId;
    private String eventCd;
    private String eventDtlCd;
    private HashMap data;

    @Builder
    public MessageNacDTO(String orderId, String eventCd, String eventDtlCd, HashMap data) {
        this.orderId = orderId;
        this.eventCd = eventCd;
        this.eventDtlCd = eventDtlCd;
        this.data = data;

    }
}