// Create interfaces `Camera` and `MusicPlayer`. Implement a class `SmartPhone` that uses both interfaces.

interface Camera {
    void useCamera();
}

interface MusicPlayer {
    void useMusicPlayer();
}

class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void useCamera() {
        System.out.println("Taking Pictures using Camera...");
    }

    @Override
    public void useMusicPlayer() {
        System.out.println("Listening Music using music player...");
    }
}

public class Main {

    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();

        s.useCamera();
        s.useMusicPlayer();
    }
}