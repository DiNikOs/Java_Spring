package lesson1.v4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Configuration
@ComponentScan("lesson1.v4")
public class AppConfig_v4 {

    @Bean(name = "camera4")
    public Camera4 camera(CameraRoll cameraRoll) {
        Camera4 camera4 = new Camera4();
        camera4.setCameraRoll(cameraRoll);
        return camera4;
    }
}
