package com.hyomee.sp.factory.unitservice.service.sus.service;

import com.hyomee.sp.factory.constant.EventCdDtlCdConst;
import com.hyomee.sp.factory.unitservice.service.NucmResultService;
import com.hyomee.sp.factory.unitservice.service.NucmService;
import com.hyomee.sp.factory.unitservice.dto.NuomResultDTO;
import com.hyomee.sp.factory.unitservice.service.sus.dto.MessageSusCdtDTO;
import com.hyomee.sp.factory.unitservice.service.sus.dto.MessageSusDdtDTO;
import com.hyomee.sp.factory.unitservice.service.sus.dto.MessageSusUdtDTO;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class NucmSusService extends NucmResultService implements NucmService {

    @Getter
    private enum SUS_EVENT_DTL_CD {
        CDT(EventCdDtlCdConst.EVENT_SUS_CDT_DTL_CD, MessageSusCdtDTO.class),
        UDT(EventCdDtlCdConst.EVENT_SUS_UDT_DTL_CD, MessageSusUdtDTO.class),
        DDT(EventCdDtlCdConst.EVENT_SUS_DDT_DTL_CD, MessageSusDdtDTO.class);

        private String eventDtlCd;
        private Class messageDto;

        SUS_EVENT_DTL_CD(String eventDtlCd, Class messageDto) {
            this.eventDtlCd = eventDtlCd;
            this.messageDto = messageDto;
        }
    }

    @Override
    public String getEventCd() {
        return EventCdDtlCdConst.EVENT_SUS_CD;
    }

    @Override
    public Class getClassName(String eventDtlCd) {
        return SUS_EVENT_DTL_CD.valueOf(eventDtlCd).getMessageDto();

    }

    @Override
    public <T> NuomResultDTO runProcess(T messageDTO, String eventDtlCd) {
        log.info("# Sus :: " + messageDTO.toString());
        return eventDtlCd.equals("DDT") ? delete(messageDTO) : save(messageDTO, eventDtlCd);

    }

    private <T> NuomResultDTO save(T messageDTO, String eventDtlCd) {
        return eventDtlCd.equals("CDT") ? insert(messageDTO) : update(messageDTO);

    }

    private <T> NuomResultDTO insert(T messageDTO) {
        log.info("# Sus :: insert || " + messageDTO.toString());
        MessageSusCdtDTO messageSusCdtDTO = (MessageSusCdtDTO) messageDTO;

        log.info("# Sus :: messageSusCdtDTO " + messageSusCdtDTO.toString());

        NuomResultDTO nuomResultDTO = super.setNucmResultDTO(messageSusCdtDTO.getOrderId(),
                messageSusCdtDTO.getEventCd(),
                messageSusCdtDTO.getEventDtlCd());
        nuomResultDTO.setOrderStatus("C");
        nuomResultDTO.setMessageCode("200");
        return nuomResultDTO;
    }

    private <T> NuomResultDTO update(T messageDTO) {
        log.info("# Sus :: update || " + messageDTO.toString());
        MessageSusUdtDTO messageSusUdtDTO = (MessageSusUdtDTO) messageDTO;

        log.info("# Sus :: messageSusUdtDTO " + messageSusUdtDTO.toString());

        NuomResultDTO nuomResultDTO = super.setNucmResultDTO(messageSusUdtDTO.getOrderId(),
                messageSusUdtDTO.getEventCd(),
                messageSusUdtDTO.getEventDtlCd());

        nuomResultDTO.setOrderStatus("C");
        nuomResultDTO.setMessageCode("200");
        return nuomResultDTO;

    }

    private <T> NuomResultDTO delete(T messageDTO) {
        log.info("# Sus :: delete || " + messageDTO.toString());
        MessageSusDdtDTO messageSusDdtDTO = (MessageSusDdtDTO) messageDTO;

        log.info("# Sus :: messageSusDdtDTO " + messageSusDdtDTO.toString());

        NuomResultDTO nuomResultDTO = super.setNucmResultDTO(messageSusDdtDTO.getOrderId(),
                messageSusDdtDTO.getEventCd(),
                messageSusDdtDTO.getEventDtlCd());

        nuomResultDTO.setOrderStatus("C");
        nuomResultDTO.setMessageCode("200");
        return nuomResultDTO;

    }

}