class Mobile {

    String brand;
    String model;
    int price;

    Mobile(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    void call(String person) {
        System.out.println("Calling " + person + "...");
    }
}

public class MobileDemo {

    public static void main(String[] args) {

        Mobile phone = new Mobile(
                "Samsung",
                "Galaxy M35",
                18000
        );

        phone.showDetails();

        System.out.println();

        phone.call("Rahul");
    }
}