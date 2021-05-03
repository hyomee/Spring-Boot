package com.hyomee.sp.factory.unitservice.service.nac.service;

import com.hyomee.sp.factory.constant.EventCdDtlCdConst;
import com.hyomee.sp.factory.unitservice.service.NucmResultService;
import com.hyomee.sp.factory.unitservice.service.NucmService;
import com.hyomee.sp.factory.unitservice.dto.NuomResultDTO;
import com.hyomee.sp.factory.unitservice.service.nac.dto.MessageNacDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class NucmNacService extends NucmResultService implements NucmService {

    @Override
    public String getEventCd() {
        return EventCdDtlCdConst.EVENT_NAC_CD;
    }

    @Override
    public Class getClassName(String eventDtlCd) {
        return MessageNacDTO.class;
    }

    @Override
    public <T> NuomResultDTO runProcess(T meaageObject,  String eventDtlCd) {

        log.info("Run NAC ..... ");
        MessageNacDTO messageNacDTO = (MessageNacDTO) meaageObject;
        log.info("messageNacDTO :: " + messageNacDTO.toString());

        NuomResultDTO nuomResultDTO = super.setNucmResultDTO(messageNacDTO.getOrderId(),
                messageNacDTO.getEventCd(),
                messageNacDTO.getEventDtlCd());

        nuomResultDTO.setOrderStatus("C");
        nuomResultDTO.setMessageCode("200");
        return nuomResultDTO;
    }


}