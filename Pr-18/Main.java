// Create an interface `Drive` with methods `start()` and `stop()`. Implement classes `Car` and `Bike`.

interface Drive {

    void start();

    void stop();
}

class Car implements Drive {

    @Override
    public void start() {
        System.out.println("Car started using key ignition...");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped...");
    }
}

class Bike implements Drive {

    @Override
    public void start() {
        System.out.println("Bike started using self-start...");
    }

    @Override
    public void stop() {
        System.out.println("Bike engine stopped...");
    }
}

public class Main {

    public static void main(String[] args) {

        Drive d;

        d = new Car();
        d.start();
        d.stop();

        System.out.println();

        d = new Bike();
        d.start();
        d.stop();
    }
}