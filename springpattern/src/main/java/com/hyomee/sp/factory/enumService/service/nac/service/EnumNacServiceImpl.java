package com.hyomee.sp.factory.enumService.service.nac.service;

import com.hyomee.sp.factory.constant.EventCdDtlCdConst;
import com.hyomee.sp.factory.enumService.dto.EnumResultDTO;
import com.hyomee.sp.factory.enumService.service.EnumService;
import com.hyomee.sp.factory.enumService.service.nac.dto.MessageNacDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EnumNacServiceImpl implements EnumService {

    @Override
    public String getEventCd() {
        return EventCdDtlCdConst.EVENT_NAC_CD;
    }

    @Override
    public <T> EnumResultDTO runProcess(T messageDTO , String sventDtlCd ) {
        log.info("# Nac :: " + messageDTO.toString());

        MessageNacDTO messageNacDTO = (MessageNacDTO) messageDTO;

        log.info("# Nac :: messageNacDTO :: " + messageNacDTO.toString());

        EnumResultDTO enumResultDTO = EnumResultDTO.builder()
                .orderId(messageNacDTO.getOrderId())
                .eventCd(messageNacDTO.getEventCd())
                .eventDtlCd(messageNacDTO.getEventDtlCd())
                .orderStatus("C")
                .messageCode("")
                .build();

        return enumResultDTO;
    }
}