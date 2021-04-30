package com.hyomee.sp.factoryMethodPattern.hookMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class FactoryMethodPatternHookMothod {
    public void process() {
        firstRun();
        secondRun();
        thirdRun();
        fourthRun();
    };


    private void firstRun() {
        log.debug("Hook Method Run :: First ");
    }

    public abstract void secondRun() ;

    protected abstract void thirdRun();

    private void fourthRun() {
        log.debug("Hook Method Run :: Fourth ");
    }

}
