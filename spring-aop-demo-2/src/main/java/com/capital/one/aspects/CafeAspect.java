package com.capital.one.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.capital.one.services.CafeService;

@Aspect
@Component
public class CafeAspect {
	@AfterReturning(pointcut="execution(* enter*(..))")
	public void afterEntering(JoinPoint jp) {
		CafeService cs = (CafeService) jp.getTarget();
		if (cs.getIsOpen()) {
			cs.success();
		} else {
			cs.failure();
		}
	}
}
