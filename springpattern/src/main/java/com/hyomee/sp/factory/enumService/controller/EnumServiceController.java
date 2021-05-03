package com.hyomee.sp.factory.enumService.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.hyomee.sp.factory.enumService.constant.EventCdConst;
import com.hyomee.sp.factory.enumService.dto.EnumResultDTO;
import com.hyomee.sp.factory.enumService.dto.Message;
import com.hyomee.sp.factory.enumService.dto.MsgDTO;
import com.hyomee.sp.factory.enumService.factory.EnumServiceFactory;
import com.hyomee.sp.factory.enumService.service.EnumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class EnumServiceController {

    private final EnumServiceFactory enumServiceFactory;
    private final Gson gson;

    @PostMapping("/factory/enumservice")
    public <T> EnumResultDTO runServiceDto(@RequestBody HashMap hashMap) {

        String jsonObject = gson.toJson(hashMap);
        Message message = Message.builder().payload(jsonObject).build();
        EnumResultDTO enumResultDTO = setEnumResultDTO(message.getPayload());

        try {
            EventCdConst eventCdConst = EventCdConst.valueOf(enumResultDTO.getEventCd());

            EnumService enumService = enumServiceFactory.getEnumService(eventCdConst, enumResultDTO.getEventCd());
            T messageDto = setMessageObject( eventCdConst,  enumResultDTO.getEventDtlCd() ,  message.getPayload());

            enumResultDTO = enumService.runProcess(messageDto, enumResultDTO.getEventDtlCd());
        } catch (RuntimeException ex ) {
            enumResultDTO.setMessageCode(ex.getMessage());
            enumResultDTO.setOrderStatus("F");

        }
        return enumResultDTO;
    }


    private EnumResultDTO setEnumResultDTO(String jsonObject) {
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(jsonObject);

        EnumResultDTO enumResultDTO = EnumResultDTO.builder()
                .orderId(element.getAsJsonObject().get("orderId").getAsString())
                .eventCd(element.getAsJsonObject().get("eventCd").getAsString())
                .eventDtlCd(element.getAsJsonObject().get("eventDtlCd").getAsString())
                .build();
        return enumResultDTO;
    }


    private <T> T setMessageObject(EventCdConst eventCdConst, String eventDtlCd , String jsonObject) {
        List<MsgDTO> msgDTOList =  eventCdConst.getMsgDTOList();
        return msgDTOList.size() == 0 ? setMessageObjForEventCd(eventCdConst, jsonObject) : setMessageObjForEventDtlCd(msgDTOList, eventDtlCd, jsonObject);
    }

    private <T> T setMessageObjForEventCd(EventCdConst eventCdConst, String jsonObject) {
        Class classt = eventCdConst.getMessageDTO();
        T messageDto = gson.fromJson(jsonObject, (Type) classt);
        return messageDto;
    }

    private <T> T setMessageObjForEventDtlCd(List<MsgDTO> msgDTOList, String eventDtlCd, String jsonObject) {

        MsgDTO msgDTOTemp = msgDTOList.stream().filter(msgDTO -> msgDTO.getEventDtlCd().equals(eventDtlCd))
                .findFirst()
                .orElseThrow(()-> new RuntimeException(String.format(" Invlaid eventDtlCd Name - %s", eventDtlCd)));

        Class classt = msgDTOTemp.getMessageDTO();
        T messageDto = gson.fromJson(jsonObject, (Type) classt);

        return messageDto;
    }
}
