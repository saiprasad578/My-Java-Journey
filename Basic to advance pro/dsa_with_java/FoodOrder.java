class FoodOrder {

    String foodName;
    int quantity;
    double price;

    FoodOrder(String foodName, int quantity, double price) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.price = price;
    }

    void showOrder() {
        System.out.println("Food: " + foodName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: ₹" + price);
    }

    void calculateBill() {
        double total = quantity * price;
        System.out.println("Total Bill: ₹" + total);
    }

    void placeOrder() {
        System.out.println("Order placed successfully!");
    }
}

public class FoodOrderDemo {

    public static void main(String[] args) {

        FoodOrder order =
                new FoodOrder("Burger", 2, 150);

        order.showOrder();

        System.out.println();

        order.calculateBill();
        order.placeOrder();
    }
}