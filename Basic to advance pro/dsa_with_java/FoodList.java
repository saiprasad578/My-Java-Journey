import java.util.ArrayList;

public class FoodList {
    public static void main(String[] args) {

        ArrayList<String> foods = new ArrayList<>();

        foods.add("Biryani");
        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Dosa");
        foods.add("Pasta");
        foods.add("Ice Cream");

        System.out.println("List of Food Items:");
        for (String food : foods) {
            System.out.println(food);
        }

        System.out.println("\nTotal Food Items: " + foods.size());
    }
}