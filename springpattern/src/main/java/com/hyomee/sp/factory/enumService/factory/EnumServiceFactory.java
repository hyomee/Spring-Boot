package com.hyomee.sp.factory.enumService.factory;

import com.hyomee.sp.factory.enumService.constant.EventCdConst;
import com.hyomee.sp.factory.enumService.service.EnumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class EnumServiceFactory {

    private final List<EnumService> enumServiceList;

    public EnumService getEnumService(EventCdConst eventCdConst, String eventCd) {
        return enumServiceList.stream()
                .filter(enumService -> enumService.getEventCd().equals(eventCd))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(String.format(" Invlaid Vehicle Name - %s", eventCd)));
    }
}