package com.hyomee.sp.factory.enumService.constant;

import com.hyomee.sp.factory.constant.EventCdDtlCdConst;
import com.hyomee.sp.factory.enumService.dto.MsgDTO;
import com.hyomee.sp.factory.enumService.service.nac.dto.MessageNacDTO;
import com.hyomee.sp.factory.enumService.service.sus.dto.MessageSusCdtDTO;
import com.hyomee.sp.factory.enumService.service.sus.dto.MessageSusDdtDTO;
import com.hyomee.sp.factory.enumService.service.sus.dto.MessageSusUdtDTO;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter

public enum EventCdConst {

    NAC(EventCdDtlCdConst.EVENT_NAC_CD, MessageNacDTO.class, new ArrayList<>()),
    SUS(EventCdDtlCdConst.EVENT_SUS_CD, Object.class, Arrays.asList(
            MsgDTO.builder().eventDtlCd(EventCdDtlCdConst.EVENT_SUS_CDT_DTL_CD).messageDTO(MessageSusCdtDTO.class).build(),
            MsgDTO.builder().eventDtlCd(EventCdDtlCdConst.EVENT_SUS_UDT_DTL_CD).messageDTO(MessageSusUdtDTO.class).build(),
            MsgDTO.builder().eventDtlCd(EventCdDtlCdConst.EVENT_SUS_DDT_DTL_CD).messageDTO(MessageSusDdtDTO.class).build()));

    private String eventCd;
    private List<MsgDTO> msgDTOList;
    private Class messageDTO;


    EventCdConst(String eventCd, Class messageDTO, List<MsgDTO> msgDTOList) {
        this.eventCd = eventCd;
        this.messageDTO = messageDTO;
        this.msgDTOList = msgDTOList;
    }

    public static EventCdConst getEventCdConst(String eventCd) {
        EventCdConst[] eventCdConsts = EventCdConst.values();
        return Arrays.stream(eventCdConsts)
                .filter(eventCdConst -> eventCdConst.getEventCd().equals(eventCd))
                .findFirst()
                .orElseThrow(()-> new RuntimeException(String.format(" Invlaid Vehicle Name - %s", eventCd)));
    }
}