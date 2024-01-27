abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract void start();

    public abstract void stop();
}

class Car extends Vehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting a car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping a car");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting a motorcycle");
    }

    @Override
    public void stop() {
        System.out.println("Stopping a motorcycle");
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("Toyota", "Corolla", 2020);
        Vehicle vehicle2 = new Motorcycle("Harley-Davidson", "Softail", 2019);

        vehicle1.start(); 
        vehicle1.stop(); 

        vehicle2.start(); 
        vehicle2.stop(); 
    }
}
