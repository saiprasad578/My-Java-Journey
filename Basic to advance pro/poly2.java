interface poly2 {
    void start();
}

class Car implements poly2 {
    public void start() {
        System.out.println("Car starts");
    }
}

class Bike implements poly2 {
    public void start() {
        System.out.println("Bike starts");
    }
}

public class Demo {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}
