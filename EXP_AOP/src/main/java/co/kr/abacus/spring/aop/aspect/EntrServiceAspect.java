package co.kr.abacus.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
public class EntrServiceAspect {
	Logger logger = LoggerFactory.getLogger(EntrServiceAspect.class);
	
	// Pointcut 정의 
	@Pointcut("execution(* co.kr.abacus.spring.aop.entr.service.EntrService.entrServcie(..))")
	public void entrServcie() {};
	
	
	@Before("entrServcie()")
	public void beforeService() {
		logger.info("*** Bean 실행 이전 ");
	}
	
	//@AfterReturning("execution(* co.kr.abacus.spring.aop.entrsvc.service.EntrBySvcService.entrBySvc(..))")
	@AfterReturning("entrServcie()")
	public void afterReturningService() {
		logger.info("*** Bean 실행 성공  ");
	}
	
	//@AfterThrowing("execution(* co.kr.abacus.spring.aop.entrsvc.service.EntrBySvcService.entrBySvc(..))")
	@AfterThrowing("entrServcie()")
	public void AfterThrowingService() {
		logger.info("*** Bean 실행 실패  ");
	}

	@Around("entrServcie()")
	public void watchEntrBySvc(ProceedingJoinPoint  pjp) {
		logger.info("Bean start - " + pjp.getSignature().getDeclaringTypeName() + " / " + pjp.getSignature().getName());
        try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        logger.info("Bean finished - " + pjp.getSignature().getDeclaringTypeName() + " / " + pjp.getSignature().getName());
	}
}
