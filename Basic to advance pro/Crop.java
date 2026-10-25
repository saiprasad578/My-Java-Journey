class Crop {

    private String cropName;
    private int availableStock;
    private int pricePerKg;

    Crop(String cropName, int availableStock, int pricePerKg) {
        this.cropName = cropName;
        this.availableStock = availableStock;
        this.pricePerKg = pricePerKg;
    }

    void sellCrop(int quantity) {
        if (quantity > 0 && quantity <= availableStock) {
            int amount = quantity * pricePerKg;
            availableStock = availableStock - quantity;

            System.out.println("Crop Sold Successfully!");
            System.out.println("Quantity Sold: " + quantity + " kg");
            System.out.println("Total Amount: ₹" + amount);
        } else {
            System.out.println("Invalid quantity or insufficient stock.");
        }
    }

    void displayStock() {
        System.out.println("Crop Name: " + cropName);
        System.out.println("Available Stock: " + availableStock + " kg");
        System.out.println("Price Per Kg: ₹" + pricePerKg);
    }
}

public class CropSalesDemo {

    public static void main(String[] args) {

        Crop crop = new Crop("Rice", 500, 40);

        crop.displayStock();

        System.out.println();

        crop.sellCrop(100);

        System.out.println();

        crop.displayStock();
    }
}