package com.zglv.travel.application.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ControllerExceptionAspect {
	@Pointcut("execution(* com.zglv.travel.application..*(..))")
	public void addAspect() {}
	
	
	@Pointcut("execution(* com.zglv.travel.application.controller..*(..))")
	public void before() {}

	@AfterReturning("before()")
	public void before(JoinPoint pjp) {
		Object[] args = pjp.getArgs();
		System.out.println("--------------request args is:"+args+"-------------");
	}
	
	@Around("addAspect()")
	public Object Interceptor(ProceedingJoinPoint pjp){
		 Object result = null; 
	        Object[] args = pjp.getArgs();
	        System.out.println("--------------args--------------");
	        
	        if(args != null && args.length >0) {
	            String deviceId = (String) args[1];
	            System.out.println(deviceId);
	        }     
	        try {
	            result =pjp.proceed();
	        } catch (Throwable e) {
	            e.printStackTrace();
	        }  
	        return result;
	}
}
