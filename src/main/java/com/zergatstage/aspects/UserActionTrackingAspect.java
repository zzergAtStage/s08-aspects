package com.zergatstage.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class UserActionTrackingAspect {
    //@Before("execution (* com.zergatstage.services.*.*(..))") --logs every method in the service package
    @Before("execution (* com.zergatstage.services.*.*transfer*(..))") //logs only transfer methods
    public void logUserActionToConsole(JoinPoint joinPoint){
        System.out.println("Tracking user action: " + joinPoint.getSignature().getName());
        System.out.println("Tracking user parameters: " + Arrays.toString(joinPoint.getArgs()));
    }
}
