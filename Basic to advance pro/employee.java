class employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void showDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }

    void giveRaise(double amount) {
        salary = salary + amount;
        System.out.println("New Salary: ₹" + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Sai", 30000);

        emp.showDetails();

        System.out.println();

        emp.giveRaise(5000);
    }
}