package com.hyomee.sp.factory.enumService.service;

import com.hyomee.sp.factory.enumService.dto.EnumResultDTO;

public class EnumResultService {


    public EnumResultDTO setEnumResultDTO(String orderId, String eventCd, String eventDtlCd ) {
        return EnumResultDTO.builder()
                .orderId(orderId)
                .eventCd(eventCd)
                .eventDtlCd(eventDtlCd)
                .build();
    }
}