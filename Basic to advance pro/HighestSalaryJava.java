import java.util.*;

class Employee {
    int id;
    String name;
    int salary;
    int departmentId;

    // Constructor
    Employee(int id, String name, int salary, int departmentId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;
    }
}

public class Main {
    public static void main(String[] args) {

        // Step 1: Create employee list
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Joe", 70000, 1));
        employees.add(new Employee(2, "Jim", 90000, 1));
        employees.add(new Employee(3, "Henry", 80000, 2));
        employees.add(new Employee(4, "Sam", 60000, 2));
        employees.add(new Employee(5, "Max", 90000, 1));

        // Step 2: Find max salary for each department
        Map<Integer, Integer> maxSalaryMap = new HashMap<>();

        for (Employee emp : employees) {
            int dept = emp.departmentId;
            int salary = emp.salary;

            maxSalaryMap.put(dept,
                Math.max(maxSalaryMap.getOrDefault(dept, 0), salary));
        }

        // Step 3: Print employees with max salary
        System.out.println("Dept | Name | Salary");

        for (Employee emp : employees) {
            if (emp.salary == maxSalaryMap.get(emp.departmentId)) {
                System.out.println(emp.departmentId + " | " + emp.name + " | " + emp.salary);
            }
        }
    }
}