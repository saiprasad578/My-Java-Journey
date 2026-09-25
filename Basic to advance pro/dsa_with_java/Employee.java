abstract class Employee {

    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    abstract double calculateBonus();
}

class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return getSalary() * 0.10;
    }
}

class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return getSalary() * 0.20;
    }
}

public class Payroll {

    public static void main(String[] args) {

        Employee developer =
                new Developer("Sai", 50000);

        Employee manager =
                new Manager("Rahul", 70000);

        System.out.println(
                developer.getName() +
                " Bonus: ₹" +
                developer.calculateBonus()
        );

        System.out.println(
                manager.getName() +
                " Bonus: ₹" +
                manager.calculateBonus()
        );
    }
}