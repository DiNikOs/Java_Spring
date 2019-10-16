package lesson1.v3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "cameraRoll")
    public CameraRoll cameraRoll() {
        return new ColorCameraRoll();
    }

    @Bean(name = "camera3")
    public Camera3 camera(CameraRoll cameraRoll) {
        Camera3 camera3 = new Camera3();
        camera3.setCameraRoll(cameraRoll);
        return camera3;
    }

}
