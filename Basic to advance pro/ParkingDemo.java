class Parking {

    private String vehicleNumber;
    private int hours;

    Parking(String vehicleNumber, int hours) {
        this.vehicleNumber = vehicleNumber;
        this.hours = hours;
    }

    void calculateFee() {
        int fee;

        if (hours <= 2) {
            fee = 30;
        } else {
            fee = 30 + (hours - 2) * 10;
        }

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Parking Hours: " + hours);
        System.out.println("Parking Fee: ₹" + fee);
    }
}

public class ParkingDemo {

    public static void main(String[] args) {

        Parking vehicle = new Parking("TS09AB1234", 5);

        vehicle.calculateFee();
    }
}