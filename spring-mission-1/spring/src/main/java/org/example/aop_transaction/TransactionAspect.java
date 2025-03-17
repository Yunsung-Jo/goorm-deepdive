package org.example.aop_transaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Aspect
@Component
public class TransactionAspect {
    private final PlatformTransactionManager transactionManager;

    @Autowired
    public TransactionAspect(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    @Pointcut("execution(* org.example.aop_transaction.*Service.*(..))")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("===== Around 실행 =====");
        TransactionDefinition definition = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(definition);
        try {
            Object result = joinPoint.proceed();
            transactionManager.commit(status);
            System.out.println("트랜잭션 커밋: " + joinPoint.getSignature().getName());
            return result;
        } catch (Throwable t) {
            transactionManager.rollback(status);
            System.out.println("트랜잭션 롤백: " + joinPoint.getSignature().getName());
            throw t;
        }
    }
}
