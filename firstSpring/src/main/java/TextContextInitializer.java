import config.Config;
import interfaces.Controller;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TextContextInitializer {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Controller calculator = context.getBean("controllerImpl", Controller.class);
        calculator.calculate();
    }
}
