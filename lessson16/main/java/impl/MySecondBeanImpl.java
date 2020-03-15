package impl;

import interfaces.MyFirstBean;
import interfaces.MySecondBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySecondBeanImpl implements MySecondBean {

    private MyFirstBean myFirstBean;

    @Autowired
    public void setMyFirstBean(MyFirstBean myFirstBean) {
        this.myFirstBean = myFirstBean;
    }

    @Override
    public void printName() {
        System.out.println(myFirstBean.getName());
    }
}
