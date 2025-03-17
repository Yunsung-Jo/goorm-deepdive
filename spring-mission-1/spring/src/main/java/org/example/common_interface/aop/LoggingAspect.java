package org.example.common_interface.aop;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect extends Log {
    @Pointcut("execution(* org.example.common_interface.aop.*Service.*(..))")
    public void logPointcut() {

    }

    @Before("org.example.common_interface.aop.LoggingAspect.logPointcut()")
    public void logBefore(JoinPoint joinPoint) {
        log("서비스 실행 전: " + joinPoint.getSignature());
        if (joinPoint.getArgs().length > 0) {
            log("서비스 args: " + Arrays.toString(joinPoint.getArgs()));
        }
    }

    @After("org.example.common_interface.aop.LoggingAspect.logPointcut()")
    public void logAfter(JoinPoint joinPoint) {
        log("서비스 실행 후: " + joinPoint.getSignature());
    }

    @AfterReturning(pointcut = "logPointcut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        log("서비스 실행 리턴값: " + result);
    }

    @AfterThrowing(pointcut = "logPointcut()", throwing = "exception")
    public void logAfterThrowing(Throwable exception) {
        errorLog(exception);
    }

    @Around("logPointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log("Around 실행 전: " + joinPoint.getSignature().getName());
        Object result = joinPoint.proceed();
        log("Around 실행 후: " + joinPoint.getSignature().getName());
        return result;
    }
}
