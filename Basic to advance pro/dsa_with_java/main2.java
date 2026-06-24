import java.util.*;

public class main2 {
    public static void main(String[] args) {
        int[][] teacher = {
            {1, 2, 3},
            {1, 2, 4},
            {1, 3, 3},
            {2, 1, 1},
            {2, 2, 1},
            {2, 3, 1},
            {2, 4, 1}
        };

        Set<String> seen = new HashSet<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int[] row : teacher) {
            int teacherId = row[0];
            int subjectId = row[1];

            String key = teacherId + "-" + subjectId;

            if (!seen.contains(key)) {
                seen.add(key);
                countMap.put(teacherId, countMap.getOrDefault(teacherId, 0) + 1);
            }
        }

        for (int teacherId : countMap.keySet()) {
            System.out.println("Teacher ID: " + teacherId + ", Count: " + countMap.get(teacherId));
        }
    }
}