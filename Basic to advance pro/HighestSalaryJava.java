import java.util.*;

class Solution56 {
    int id;
    String name;
    int salary;
    int departmentId;

    Solution56(int id, String name, int salary, int departmentId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Solution56> employees = Arrays.asList(
            new Solution56(1, "Joe", 70000, 1),
            new Solution56(2, "Jim", 90000, 1),
            new Solution56(3, "Henry", 80000, 2),
            new Solution56(4, "Sam", 60000, 2),
            new Solution56(5, "Max", 90000, 1)
        );

        // Step 1: Find max salary per department
        Map<Integer, Integer> maxSalary = new HashMap<>();

        for (Solution56 e : employees) {
            maxSalary.put(e.departmentId,
                Math.max(maxSalary.getOrDefault(e.departmentId, 0), e.salary));
        }

        // Step 2: Print employees with max salary
        for (Solution56 e : employees) {
            if (e.salary == maxSalary.get(e.departmentId)) {
                System.out.println(e.departmentId + " | " + e.name + " | " + e.salary);
            }
        }
    }
}