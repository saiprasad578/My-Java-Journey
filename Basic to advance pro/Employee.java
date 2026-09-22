abstract class Employee {

    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Encapsulation
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Abstraction
    abstract void work();
}


// Inheritance
class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    // Polymorphism
    @Override
    void work() {
        System.out.println(getName() + " is writing Java code.");
    }
}


class Tester extends Employee {

    Tester(String name, double salary) {
        super(name, salary);
    }

    // Polymorphism
    @Override
    void work() {
        System.out.println(getName() + " is testing the application.");
    }
}


public class EmployeeManagement {

    public static void main(String[] args) {

        Employee emp1 =
                new Developer("Sai", 50000);

        Employee emp2 =
                new Tester("Rahul", 45000);

        System.out.println(emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());
        emp1.work();

        System.out.println();

        System.out.println(emp2.getName());
        System.out.println("Salary: " + emp2.getSalary());
        emp2.work();
    }
}