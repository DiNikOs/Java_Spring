package lesson1.v4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client4 {
    public static void main(String[] args) {
        ApplicationContext context4 = new AnnotationConfigApplicationContext(AppConfig_v4.class);
        Camera4 camera4 = context4.getBean("camera4", Camera4.class);
        camera4.doPhotograph();
    }
}
