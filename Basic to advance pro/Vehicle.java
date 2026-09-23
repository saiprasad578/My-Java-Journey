abstract class Vehicle {

    private String name;
    private double price;

    Vehicle(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    abstract void rent();
}

class Car extends Vehicle {

    Car(String name, double price) {
        super(name, price);
    }

    @Override
    void rent() {
        System.out.println(getName() + " car rented for ₹" + getPrice());
    }
}

class Bike extends Vehicle {

    Bike(String name, double price) {
        super(name, price);
    }

    @Override
    void rent() {
        System.out.println(getName() + " bike rented for ₹" + getPrice());
    }
}

public class VehicleRental {

    public static void main(String[] args) {

        Vehicle car = new Car("Honda City", 1500);
        Vehicle bike = new Bike("Royal Enfield", 800);

        car.rent();
        bike.rent();
    }
}