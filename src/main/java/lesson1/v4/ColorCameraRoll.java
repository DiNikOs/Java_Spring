package lesson1.v4;

import org.springframework.stereotype.Component;

public class ColorCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("-1 color frame");
    }
}
