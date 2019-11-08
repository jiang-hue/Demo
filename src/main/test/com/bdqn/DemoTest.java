package com.bdqn;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    @Test
    public void print(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       HelloSpring helloSpring=(HelloSpring)context.getBean("helloSpring");
       helloSpring.show();
    }
}
