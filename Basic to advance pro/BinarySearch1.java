class BinarySearch1 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int key = 40, l = 0, r = a.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == key) {
                System.out.println("Found");
                return;
            }
            if (key < a[mid]) r = mid - 1;
            else l = mid + 1;
        }
        System.out.println("Not Found");
    }
}
