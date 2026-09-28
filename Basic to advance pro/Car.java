class Car {

    String brand;
    String color;
    int speed;

    Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    void drive() {
        System.out.println(brand + " is running.");
    }

    void stop() {
        speed = 0;
        System.out.println(brand + " has stopped.");
    }
}

public class CarDemo {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "White", 80);

        car.showDetails();

        System.out.println();

        car.drive();
        car.stop();
    }
}