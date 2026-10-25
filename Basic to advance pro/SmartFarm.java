class SmartFarm {

    private String cropName;
    private int soilMoisture;
    private int temperature;

    SmartFarm(String cropName, int soilMoisture, int temperature) {
        this.cropName = cropName;
        this.soilMoisture = soilMoisture;
        this.temperature = temperature;
    }

    void checkCropCondition() {
        System.out.println("Crop Name: " + cropName);
        System.out.println("Soil Moisture: " + soilMoisture + "%");
        System.out.println("Temperature: " + temperature + "°C");

        if (soilMoisture < 30) {
            System.out.println("Action: Water the crops.");
        } else {
            System.out.println("Action: Soil moisture is sufficient.");
        }

        if (temperature > 35) {
            System.out.println("Warning: High temperature detected!");
        }
    }

    void waterCrops() {
        soilMoisture = soilMoisture + 20;

        if (soilMoisture > 100) {
            soilMoisture = 100;
        }

        System.out.println("Crops watered successfully.");
    }
}

public class SmartFarmDemo {

    public static void main(String[] args) {

        SmartFarm farm = new SmartFarm("Rice", 20, 38);

        farm.checkCropCondition();

        System.out.println();

        farm.waterCrops();

        System.out.println();

        farm.checkCropCondition();
    }
}