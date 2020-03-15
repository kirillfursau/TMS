import config.Config;
import interfaces.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TextContextInitializer {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Calculator calculator = context.getBean("calculatorImpl", Calculator.class);
        System.out.println(calculator.calculate());
    }
}
