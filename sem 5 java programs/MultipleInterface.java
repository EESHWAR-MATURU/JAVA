interface Vehicle {
    void start();

    void stop();
}

interface MusicPlayer {
    void play();

    void pause();
}

class Car implements Vehicle, MusicPlayer {
    @Override
    public void start() {
        System.out.println("Starting car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping car");
    }

    @Override
    public void play() {
        System.out.println("Playing music in car");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music in car");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.play();
        myCar.pause();
        myCar.stop();
    }
}
