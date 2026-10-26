class ElectricityMeter {

    private String houseOwner;
    private int previousReading;
    private int currentReading;
    private int ratePerUnit;

    ElectricityMeter(String houseOwner, int previousReading,
                    int currentReading, int ratePerUnit) {
        this.houseOwner = houseOwner;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.ratePerUnit = ratePerUnit;
    }

    void calculateBill() {
        if (currentReading >= previousReading) {
            int units = currentReading - previousReading;
            int bill = units * ratePerUnit;

            System.out.println("House Owner: " + houseOwner);
            System.out.println("Units Consumed: " + units);
            System.out.println("Total Bill: Rs." + bill);
        } else {
            System.out.println("Invalid meter readings.");
        }
    }

    void updateReading(int newReading) {
        if (newReading >= currentReading) {
            previousReading = currentReading;
            currentReading = newReading;
            System.out.println("Meter reading updated.");
        } else {
            System.out.println("New reading cannot be smaller.");
        }
    }
}

public class ElectricityMeterDemo {

    public static void main(String[] args) {

        ElectricityMeter meter =
                new ElectricityMeter("Sai", 1200, 1350, 5);

        meter.calculateBill();

        System.out.println();

        meter.updateReading(1400);

        System.out.println();

        meter.calculateBill();
    }
}