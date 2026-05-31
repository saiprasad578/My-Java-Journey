class Employee {

    // Private variables
    private String name;
    private double salary;

    // Setter methods
    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        salary = s;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EployeeTest {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setName("Sai");
        emp.setSalary(50000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}