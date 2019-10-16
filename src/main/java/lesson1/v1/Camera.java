package lesson1.v1;

public class Camera {
    private CameraRoll cameraRoll;

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Photo!!!");
        cameraRoll.processing();
    }

}
