package com.hyomee.sp.factoryMethodPattern.hookMethod;

import com.hyomee.sp.factoryMethodPattern.basic.FactoryMethodPatternParent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class FactoryMethodPatternHookChild extends FactoryMethodPatternHookMothod {

    @Override
    public void secondRun() {
        log.debug("Hook Method FactoryMethodPatternHookChild Run :: Second ");
    }

    @Override
    protected void thirdRun() {
        log.debug("Hook Method FactoryMethodPatternHookChild Run :: Third ");
    }
}
