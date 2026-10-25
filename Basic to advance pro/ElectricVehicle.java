class ElectricVehicle {

    private String vehicleName;
    private int batteryLevel;
    private int chargingUnits;

    ElectricVehicle(String vehicleName, int batteryLevel) {
        this.vehicleName = vehicleName;
        this.batteryLevel = batteryLevel;
    }

    void chargeBattery(int units) {
        chargingUnits = units;
        batteryLevel = batteryLevel + units;

        if (batteryLevel > 100) {
            batteryLevel = 100;
        }

        System.out.println("Vehicle charged successfully.");
    }

    void displayDetails() {
        int cost = chargingUnits * 8;

        System.out.println("Vehicle: " + vehicleName);
        System.out.println("Battery Level: " + batteryLevel + "%");
        System.out.println("Charging Cost: ₹" + cost);
    }
}

public class EVChargingDemo {

    public static void main(String[] args) {

        ElectricVehicle vehicle = new ElectricVehicle("Tata Nexon EV", 40);

        vehicle.displayDetails();

        System.out.println();

        vehicle.chargeBattery(35);

        vehicle.displayDetails();
    }
}