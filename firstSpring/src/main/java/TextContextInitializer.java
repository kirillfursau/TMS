import config.Config;
import interfaces.Context;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TextContextInitializer {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Context calculator = context.getBean("contextImpl", Context.class);
        System.out.println(calculator.calculate());
    }
}
