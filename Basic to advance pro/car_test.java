class Car {


    private String brand;
    private int speed;


    public void setBrand(String b) {
        brand = b;
    }

    public void setSpeed(int s) {
        speed = s;
    }

 
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }
}

public class car_test {
    public static void main(String[] args) {

        Car c = new Car();

        c.setBrand("BMW");
        c.setSpeed(180);

        System.out.println("Car Brand: " + c.getBrand());
        System.out.println("Car Speed: " + c.getSpeed());
    }
}