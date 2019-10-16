package lesson1.v2;

import org.springframework.stereotype.Component;

@Component("cameraRoll")
public class BlackAndWhiteCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("-1 b/w frame");
    }
}
