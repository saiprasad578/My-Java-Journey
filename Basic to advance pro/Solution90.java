public class Solution90 {
    public static void main(String[] args) {
        int arr[] = {4,5, 7, 8, 6, 6};

        System.out.println("Duplicates:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
} 