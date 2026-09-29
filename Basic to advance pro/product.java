class product {

    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void showProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    void calculateTotal() {
        double total = price * quantity;
        System.out.println("Total: ₹" + total);
    }
}

public class ProductDemo {

    public static void main(String[] args) {

        Product product =
                new Product("Keyboard", 800, 2);

        product.showProduct();

        System.out.println();

        product.calculateTotal();
    }
}