package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogeTimeToCalculate {
    private long startCalculate;
    private long timeToCalculate;

    @Pointcut("@annotation(annotation.StartTimeToCalculate)")
    public void startTime() {
    }

    @Pointcut("@annotation(annotation.EndTimeToCalculate)")
    public void endTime() {
    }

    @After("endTime()")
    public void afterCallAt() {
        timeToCalculate = System.currentTimeMillis() - startCalculate;
        System.out.printf("Time to calculate %d millis", timeToCalculate);
    }

    @Before("startTime()")
    public void beforeCallAt() {
       startCalculate = System.currentTimeMillis();
    }
}
