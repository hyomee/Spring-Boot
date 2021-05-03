package com.hyomee.sp.factory.unitservice.factory;

import com.hyomee.sp.factory.unitservice.service.NucmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NucmServiceFactory {

    private final List<NucmService> nucmServiceList;

    public NucmService getNucmService(String eventCd) {
        return nucmServiceList.stream()
                .filter(nucmService -> nucmService.getEventCd().equalsIgnoreCase(eventCd))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(String.format(" Invlaid Vehicle Name - %s", eventCd)));
    }


}