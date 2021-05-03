package com.hyomee.sp.factory.enumService.service.sus.srevice;

import com.hyomee.sp.factory.constant.EventCdDtlCdConst;
import com.hyomee.sp.factory.enumService.dto.EnumResultDTO;
import com.hyomee.sp.factory.enumService.service.EnumService;
import com.hyomee.sp.factory.enumService.service.EnumResultService;
import com.hyomee.sp.factory.enumService.service.sus.dto.MessageSusCdtDTO;
import com.hyomee.sp.factory.enumService.service.sus.dto.MessageSusDdtDTO;
import com.hyomee.sp.factory.enumService.service.sus.dto.MessageSusUdtDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EnumSusServiceImpl extends EnumResultService implements EnumService {



    @Override
    public String getEventCd() {
        return EventCdDtlCdConst.EVENT_SUS_CD;
    }

    @Override
    public <T> EnumResultDTO runProcess(T messageDTO, String eventDtlCd) {
        log.info("# Sus :: " + messageDTO.toString());
        return eventDtlCd.equals("DDT") ? delete(messageDTO) : save(messageDTO, eventDtlCd);

    }

    private <T> EnumResultDTO save(T messageDTO, String eventDtlCd) {
        return eventDtlCd.equals("CDT") ? insert(messageDTO) : update(messageDTO);

    }

    private <T> EnumResultDTO insert(T messageDTO) {
        log.info("# Sus :: insert || " + messageDTO.toString());
        MessageSusCdtDTO messageSusCdtDTO = (MessageSusCdtDTO) messageDTO;

        log.info("# Sus :: messageSusCdtDTO " + messageSusCdtDTO.toString());

        EnumResultDTO enumResultDTO = super.setEnumResultDTO(messageSusCdtDTO.getOrderId(),
                messageSusCdtDTO.getEventCd(),
                messageSusCdtDTO.getEventDtlCd());
        enumResultDTO.setOrderStatus("C");
        return enumResultDTO;
    }

    private <T> EnumResultDTO update(T messageDTO) {
        log.info("# Sus :: update || " + messageDTO.toString());
        MessageSusUdtDTO messageSusUdtDTO = (MessageSusUdtDTO) messageDTO;

        log.info("# Sus :: messageSusUdtDTO " + messageSusUdtDTO.toString());

        EnumResultDTO enumResultDTO = super.setEnumResultDTO(messageSusUdtDTO.getOrderId(),
                messageSusUdtDTO.getEventCd(),
                messageSusUdtDTO.getEventDtlCd());

        enumResultDTO.setOrderStatus("C");
        return enumResultDTO;

    }
    private <T> EnumResultDTO delete(T messageDTO) {
        log.info("# Sus :: delete || " + messageDTO.toString());
        MessageSusDdtDTO messageSusDdtDTO = (MessageSusDdtDTO) messageDTO;

        log.info("# Sus :: messageSusDdtDTO " + messageSusDdtDTO.toString());

        EnumResultDTO enumResultDTO = super.setEnumResultDTO(messageSusDdtDTO.getOrderId(),
                messageSusDdtDTO.getEventCd(),
                messageSusDdtDTO.getEventDtlCd());

        enumResultDTO.setOrderStatus("C");
        return enumResultDTO;

    }


}