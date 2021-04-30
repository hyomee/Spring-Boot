package com.hyomee.sp.factoryMethodPattern;

import com.hyomee.sp.factoryMethodPattern.basic.FactoryMethodPatternChildA;
import com.hyomee.sp.factoryMethodPattern.hookMethod.FactoryMethodPatternHookChild;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactoryMethodPatternTests {

    @Autowired
    private FactoryMethodPatternChildA factoryMethodPatternChildA;

    @Autowired
    private FactoryMethodPatternHookChild factoryMethodPatternHookChild;

    @Test
    void factoryMethodPatternChildA() {
        factoryMethodPatternChildA.process();
    }

    @Test
    void factoryMethodPatternHookChild() {
        factoryMethodPatternHookChild.process();
    }

}
