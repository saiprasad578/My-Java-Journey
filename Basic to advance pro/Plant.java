class Plant {

    private String plantName;
    private double height;
    private int waterLevel;

    Plant(String plantName, double height, int waterLevel) {
        this.plantName = plantName;
        this.height = height;
        this.waterLevel = waterLevel;
    }

    void addWater(int amount) {
        waterLevel = waterLevel + amount;
        System.out.println("Water added successfully!");
    }

    void displayStatus() {
        System.out.println("Plant Name: " + plantName);
        System.out.println("Plant Height: " + height + " cm");
        System.out.println("Water Level: " + waterLevel + "%");

        if (waterLevel < 30) {
            System.out.println("Status: Plant needs water.");
        } else {
            System.out.println("Status: Water level is sufficient.");
        }
    }
}

public class PlantDemo {

    public static void main(String[] args) {

        Plant plant = new Plant("Rose", 15.5, 20);

        plant.displayStatus();

        System.out.println();

        plant.addWater(30);

        plant.displayStatus();
    }
}