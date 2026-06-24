import java.util.*;

public class Main {
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

        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int[] row : teacher) {
            int teacherId = row[0];
            int subjectId = row[1];

            map.putIfAbsent(teacherId, new HashSet<>());
            map.get(teacherId).add(subjectId);
        }

        for (int teacherId : map.keySet()) {
            System.out.println("Teacher ID: " + teacherId + ", Count: " + map.get(teacherId).size());
        }
    }
}