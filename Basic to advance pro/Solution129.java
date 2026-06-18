public class Solution129 {
    public static void main(String[] args) {
        int n = 4; // Size of the matrix
        int[][] matrix = new int[n][n];
        
        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        
        // Outer loop manages layers, inner loops handle the 4 directions
        while (value <= n * n) {
            // 1. Traverse down the left column
            for (int i = top; i <= bottom && value <= n * n; i++) {
                matrix[i][left] = value++;
            }
            left++; // Move left boundary right
            
            // 2. Traverse right across the bottom row
            for (int i = left; i <= right && value <= n * n; i++) {
                matrix[bottom][i] = value++;
            }
            bottom--; // Move bottom boundary up
            
            // 3. Traverse up the right column
            for (int i = bottom; i >= top && value <= n * n; i--) {
                matrix[i][right] = value++;
            }
            right--; // Move right boundary left
            
            // 4. Traverse left across the top row
            for (int i = right; i >= left && value <= n * n; i--) {
                matrix[top][i] = value++;
            }
            top++; // Move top boundary down
        }
        
        // Loop to print the resulting matrix cleanly
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}