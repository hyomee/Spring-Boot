package com.hyomee.sp.factory.unitservice.service;

import com.hyomee.sp.factory.unitservice.dto.NuomResultDTO;

public interface NucmService {
    String getEventCd();
    Class getClassName(String eventDtlCd);


    <T> NuomResultDTO runProcess(T meaageObject, String eventDtlCd);
}