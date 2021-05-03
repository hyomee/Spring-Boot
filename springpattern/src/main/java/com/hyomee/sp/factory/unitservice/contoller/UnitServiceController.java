package com.hyomee.sp.factory.unitservice.contoller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.hyomee.sp.factory.enumService.dto.Message;
import com.hyomee.sp.factory.unitservice.dto.NuomResultDTO;
import com.hyomee.sp.factory.unitservice.service.NucmService;
import com.hyomee.sp.factory.unitservice.factory.NucmServiceFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.util.HashMap;

@Slf4j
@RequiredArgsConstructor
@RestController
public class UnitServiceController {

    private final NucmServiceFactory nucmServiceFactory;
    private final Gson gson;

    @PostMapping("/factory/unitService")
    public <T> NuomResultDTO runServiceDto(@RequestBody HashMap hashMap) {

        String jsonObject = gson.toJson(hashMap);
        Message message = Message.builder().payload(jsonObject).build();
        NuomResultDTO nuomResultDTO = setNuomResultDTO(message.getPayload());
        log.info("NuomResultDTO :: " + nuomResultDTO.toString());
        try {
            NucmService nucmService = nucmServiceFactory.getNucmService(getEventCd(jsonObject));
            T messageDto = getMessageObject(nucmService, nuomResultDTO.getEventDtlCd(), jsonObject);
            nuomResultDTO = nucmService.runProcess(messageDto, nuomResultDTO.getEventDtlCd());
        } catch (RuntimeException ex ) {
            nuomResultDTO.setMessageCode(ex.getMessage());
            nuomResultDTO.setOrderStatus("F");
        }
        return nuomResultDTO;
    }

    private NuomResultDTO setNuomResultDTO(String jsonObject) {
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(jsonObject);

        NuomResultDTO nuomResultDTO = NuomResultDTO.builder()
                .orderId(element.getAsJsonObject().get("orderId").getAsString())
                .eventCd(element.getAsJsonObject().get("eventCd").getAsString())
                .eventDtlCd(element.getAsJsonObject().get("eventDtlCd").getAsString())
                .build();

        return nuomResultDTO;
    }

    private String getEventCd(String jsonObject) {
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(jsonObject);
        return element.getAsJsonObject().get("eventCd").getAsString();
    }


    private <T> T getMessageObject(NucmService nucmService, String eventDtlCd, String jsonObject) {
        Class classt = nucmService.getClassName(eventDtlCd);
        T messageDto = gson.fromJson(jsonObject, (Type) classt);
        return messageDto;
    }


}