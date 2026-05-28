import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // 1. Move Right across the top boundary
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++; // Move top boundary down

            // 2. Move Down along the right boundary
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // Move right boundary left

            // 3. Move Left across the bottom boundary (check if row still exists)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--; // Move bottom boundary up
            }

            // 4. Move Up along the left boundary (check if column still exists)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Move left boundary right
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}
        };

        List<Integer> spiral = spiralOrder(matrix);
        System.out.println("Spiral Order: " + spiral);
    }
}