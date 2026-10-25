class Dustbin {

    private String location;
    private int capacity;
    private int wasteLevel;

    Dustbin(String location, int capacity, int wasteLevel) {
        this.location = location;
        this.capacity = capacity;
        this.wasteLevel = wasteLevel;
    }

    void addWaste(int amount) {
        if (wasteLevel + amount <= capacity) {
            wasteLevel = wasteLevel + amount;
            System.out.println("Waste added successfully.");
        } else {
            System.out.println("Dustbin is full!");
        }
    }

    void collectWaste() {
        wasteLevel = 0;
        System.out.println("Waste collected successfully.");
    }

    void displayStatus() {
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " kg");
        System.out.println("Waste Level: " + wasteLevel + " kg");

        if (wasteLevel >= capacity * 0.8) {
            System.out.println("Status: Dustbin needs collection.");
        } else {
            System.out.println("Status: Dustbin has enough space.");
        }
    }
}

public class WasteManagementDemo {

    public static void main(String[] args) {

        Dustbin bin = new Dustbin("College Campus", 100, 60);

        bin.displayStatus();

        System.out.println();

        bin.addWaste(25);
        bin.displayStatus();

        System.out.println();

        bin.collectWaste();
        bin.displayStatus();
    }
}