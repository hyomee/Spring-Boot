package com.hyomee.sp.factory.enumService.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Message {

    private String payload;

    @Builder
    public Message(String payload) {
        this.payload = payload;
    }

}
