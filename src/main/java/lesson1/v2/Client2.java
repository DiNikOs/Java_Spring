package lesson1.v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client2 {
    public static void main(String[] args) {
        ApplicationContext context2 = new ClassPathXmlApplicationContext("appContext2.xml");
        Camera2 camera2 = context2.getBean("camera2", Camera2.class);
        camera2.doPhotograph();
    }
}
