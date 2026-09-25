class Product {

    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Cart {

    private double total = 0;

    void addProduct(Product product) {
        total += product.getPrice();
        System.out.println(product.getName() + " added to cart");
    }

    void showTotal() {
        System.out.println("Total: ₹" + total);
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        Product phone = new Product("Phone", 15000);
        Product mouse = new Product("Mouse", 800);

        Cart cart = new Cart();

        cart.addProduct(phone);
        cart.addProduct(mouse);

        cart.showTotal();
    }
}