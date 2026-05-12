// Design an interface `Ride` with methods `bookRide()` and `calculateFare()`. Implement classes `BikeRide`, `CarRide`, and `AutoRide`.

interface Ride {
    void bookRide();

    void calculateFare(double distance);
}

class BikeRide implements Ride {
    private final double chargePerKm = 45.5;

    @Override
    public void bookRide() {
        System.out.println("Booking a Bike Ride. Please wait a minute...");
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Distance: " + distance + ", Fare: " + distance * chargePerKm);
    }
}

class CarRide implements Ride {
    private final double chargePerKm = 115.5;

    @Override
    public void bookRide() {
        System.out.println("Booking a Car Ride. Please wait a minute...");
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Distance: " + distance + ", Fare: " + distance * chargePerKm);
    }
}

class AutoRide implements Ride {
    private final double chargePerKm = 65.5;

    @Override
    public void bookRide() {
        System.out.println("Booking a Auto Ride. Please wait a minute...");
    }

    @Override
    public void calculateFare(double distance) {
        System.out.println("Distance: " + distance + ", Fare: " + distance * chargePerKm);
    }
}

public class Main {

    public static void main(String[] args) {
        Ride r;

        r = new BikeRide();
        r.bookRide();
        r.calculateFare(15.20);

        r = new CarRide();
        r.bookRide();
        r.calculateFare(150.25);

        r = new AutoRide();
        r.bookRide();
        r.calculateFare(80.55);
    }
}