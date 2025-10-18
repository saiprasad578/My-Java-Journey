public class price {
    public static void main(String[] args) {
        String itemName = "Laptop";
        double itemPrice = 799.99;
        double discountRate = 0.10; // 10% discount

        double discountAmount = itemPrice * discountRate;
        double finalPrice = itemPrice - discountAmount;

        System.out.println("Item: " + itemName);
        System.out.println("Original Price: $" + itemPrice);
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Final Price after Discount: $" + finalPrice);
    }
}