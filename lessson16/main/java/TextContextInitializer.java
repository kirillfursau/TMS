import interfaces.MySecondBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextContextInitializer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        MySecondBean firstInterface = context.getBean(MySecondBean.class);
        firstInterface.printName("name");
    }
}
