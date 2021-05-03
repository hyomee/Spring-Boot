package com.hyomee.sp.factory.enumService.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MsgDTO {

    private String eventDtlCd;
    private Class messageDTO;

    @Builder
    MsgDTO(String eventDtlCd, Class messageDTO) {
        this.eventDtlCd = eventDtlCd;
        this.messageDTO = messageDTO;
    }
}