package speculatingwook.spring.transactional;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.transaction.annotation.Transactional;

@Aspect
public class TransactionAspect {

    @Around("@annotation(transactional)")
    public Object manageTransaction(ProceedingJoinPoint joinPoint, Transactional transactional) throws Throwable {
        Object result = null;
        System.out.println(">> [AOP] Transaction started.");
        try {
            result = joinPoint.proceed();
            System.out.println(">> [AOP] Transaction committed.");
        } catch (Exception ex) {
            System.out.println(">> [AOP] Transaction rolled back.");
            throw ex;
        }
        return result;
    }
}
