package lesson1.v3;

public class Camera3 {
    private CameraRoll cameraRoll;

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Photo!!!");
        cameraRoll.processing();
    }

}
