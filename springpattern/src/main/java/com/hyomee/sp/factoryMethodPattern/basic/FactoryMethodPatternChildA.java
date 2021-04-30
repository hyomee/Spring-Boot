package com.hyomee.sp.factoryMethodPattern.basic;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class FactoryMethodPatternChildA extends FactoryMethodPatternParent{
    @Override
    public void process() {
        log.debug("Process FactoryMethodPatternChildA");
    }
}
