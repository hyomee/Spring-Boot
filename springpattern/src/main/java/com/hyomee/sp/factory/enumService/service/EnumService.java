package com.hyomee.sp.factory.enumService.service;

import com.hyomee.sp.factory.enumService.dto.EnumResultDTO;

public interface EnumService {

    String getEventCd();
    <T> EnumResultDTO runProcess(T messageDTO , String sventDtlCd);

}