package impl;

import interfaces.MyFirstBean;
import org.springframework.stereotype.Component;

@Component
public class MyFirstBeanImpl implements MyFirstBean {

    public String name;

    public MyFirstBeanImpl(String name) {
        this.name = "kiryl";
    }

    @Override
    public String getName() {
        return name;
    }
}
