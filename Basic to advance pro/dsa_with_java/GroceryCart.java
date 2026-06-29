import java.util.ArrayList;

public class GroceryCart {
    public static void main(String[] args) {
        // 1. Create an ArrayList
        // Notice we don't have to specify a size upfront!
        ArrayList<String> cart = new ArrayList<>();

        // 2. Add items to the list using add()
        cart.add("Apples");
        cart.add("Bread");
        cart.add("Milk");
        cart.add("Coffee");

        // 3. Retrieve an item by its index using get()
        // Remember: Java is zero-indexed, so the first item is at index 0
        System.out.println("The first item is: " + cart.get(0));

        // 4. Check how many items are in the list using size()
        System.out.println("Total items before removal: " + cart.size());

        // 5. Remove an item (either by name or by index)
        cart.remove("Bread"); 

        // 6. Iterate (loop) through the ArrayList
        System.out.println("\n--- Current Cart Contents ---");
        for (String item : cart) {
            System.out.println("- " + item);
        }
    }
}