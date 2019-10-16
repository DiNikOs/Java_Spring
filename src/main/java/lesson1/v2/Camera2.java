package lesson1.v2;

public class Camera2 {
    private CameraRoll cameraRoll;

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Photo!!!");
        cameraRoll.processing();
    }

}
