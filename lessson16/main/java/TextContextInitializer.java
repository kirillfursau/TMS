import config.Config;
import interfaces.MySecondBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TextContextInitializer {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MySecondBean mySecondBean = context.getBean("mySecondBeanImpl", MySecondBean.class);
        mySecondBean.printName();
    }
}
