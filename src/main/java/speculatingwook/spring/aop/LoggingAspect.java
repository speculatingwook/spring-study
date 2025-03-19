package speculatingwook.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* speculatingwook.spring.aop.CalculatorService.add(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[AOP] Before method: " + joinPoint.getSignature());
        Object result = joinPoint.proceed();
        System.out.println("[AOP] After method: " + joinPoint.getSignature() + " with result: " + result);
        return result;
    }
}