package day1.worksheet;

class Vehicle {
    protected double speed;        // in km/h
    protected double fuelCapacity; // in liters

    public Vehicle(double speed, double fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    // This method can be overridden in subclasses
    public double getMileage() {
        return 0; // Default
    }
}
class Car extends Vehicle {
    public Car(double speed, double fuelCapacity) {
        super(speed, fuelCapacity);
    }

    @Override
    public double getMileage() {
        // Simple formula for demonstration: mileage = speed * 0.2
        return speed * 0.2;
    }
}

class Truck extends Vehicle {
    public Truck(double speed, double fuelCapacity) {
        super(speed, fuelCapacity);
    }

    @Override
    public double getMileage() {
        // Trucks usually have lower mileage
        return speed * 0.1;
    }
}


public class Q2_Vehicle {
    public static void main(String[] args) {
        Car myCar = new Car(100, 50);      // speed = 100 km/h, fuelCapacity = 50L
        Truck myTruck = new Truck(80, 120); // speed = 80 km/h, fuelCapacity = 120L

        System.out.println("Car Mileage: " + myCar.getMileage() + " km/l");
        System.out.println("Truck Mileage: " + myTruck.getMileage() + " km/l");
    }
}
