class LinearSearch {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int key = 30;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
