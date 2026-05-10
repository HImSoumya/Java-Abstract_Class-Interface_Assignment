
// Create an abstract class `Vehicle` with method `getMileage()`. Implement subclasses `Car`, `Bike`, and `Truck` with different mileage logic.
import java.text.DecimalFormat;

abstract class Vehicle {

    protected double distanceCovered;
    protected double fuelConsumption;

    abstract double getMileage();
}

class Car extends Vehicle {

    Car(double distanceCovered, double fuelConsumption) {
        this.distanceCovered = distanceCovered;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double getMileage() {
        return (distanceCovered / fuelConsumption) - 2;
    }
}

class Bike extends Vehicle {

    Bike(double distanceCovered, double fuelConsumption) {
        this.distanceCovered = distanceCovered;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double getMileage() {
        return (distanceCovered / fuelConsumption) + 5;
    }
}

class Truck extends Vehicle {

    Truck(double distanceCovered, double fuelConsumption) {
        this.distanceCovered = distanceCovered;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double getMileage() {
        return (distanceCovered / fuelConsumption) - 2;
    }
}

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Vehicle v;

        v = new Car(250, 20);
        System.out.println("Car's Milege: " + df.format(v.getMileage()) + " Kmpl");

        v = new Bike(250, 6);
        System.out.println("Bike's Milege: " + df.format(v.getMileage()) + " Kmpl");

        v = new Truck(250, 60);
        System.out.println("Truck's Milege: " + df.format(v.getMileage()) + " Kmpl");
    }
}