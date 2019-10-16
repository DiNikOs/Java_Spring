package lesson1.v3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client3 {
    public static void main(String[] args) {
        ApplicationContext context3 = new AnnotationConfigApplicationContext(AppConfig.class);
        Camera3 camera3 = context3.getBean("camera3", Camera3.class);
        camera3.doPhotograph();
    }
}
