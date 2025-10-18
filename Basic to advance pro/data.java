public class data {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}