abstract class Food {

    private String name;
    private double price;

    Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    abstract void prepare();
}

class Pizza extends Food {

    Pizza(String name, double price) {
        super(name, price);
    }

    @Override
    void prepare() {
        System.out.println("Preparing pizza...");
    }
}

class Burger extends Food {

    Burger(String name, double price) {
        super(name, price);
    }

    @Override
    void prepare() {
        System.out.println("Preparing burger...");
    }
}

class Order {

    void placeOrder(Food food) {

        System.out.println("Order: " + food.getName());
        System.out.println("Price: ₹" + food.getPrice());

        food.prepare();

        System.out.println("Order placed!");
    }
}

public class FoodDelivery {

    public static void main(String[] args) {

        Food food = new Pizza("Cheese Pizza", 250);

        Order order = new Order();

        order.placeOrder(food);
    }
}