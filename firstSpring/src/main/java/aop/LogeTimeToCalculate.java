package aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogeTimeToCalculate {

    @Pointcut("@annotation(annotation.StartTimeToCalculate)")
    public void startTime() {
    }

    @Pointcut("@annotation(annotation.EndTimeToCalculate)")
    public void endTime() {
    }

    @After("endTime()")
    public void afterCallAt() {
        System.out.println("Bye");
    }

    @Before("startTime()")
    public void beforeCallAt() {
        System.out.println("hello");
    }
}
