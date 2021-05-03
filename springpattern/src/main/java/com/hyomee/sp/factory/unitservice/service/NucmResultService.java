package com.hyomee.sp.factory.unitservice.service;

import com.hyomee.sp.factory.unitservice.dto.NuomResultDTO;

public class NucmResultService {
    public NuomResultDTO setNucmResultDTO(String orderId, String eventCd, String eventDtlCd ) {
        return NuomResultDTO.builder()
                .orderId(orderId)
                .eventCd(eventCd)
                .eventDtlCd(eventDtlCd)
                .build();
    }
}