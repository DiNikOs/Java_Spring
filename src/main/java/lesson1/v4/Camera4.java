package lesson1.v4;

public class Camera4 {
    private CameraRoll cameraRoll;

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Photo!!!");
        cameraRoll.processing();
    }

}
