public class LinearSearch2 {
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25};
        int key = 15;
        int found = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = i;
                break;
            }
        }

        if (found != -1)
            System.out.println("Element found at index: " + found);
        else
            System.out.println("Element not found");
    }
}