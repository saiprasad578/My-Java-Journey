class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int grade) {
        super(name);   // Call parent constructor
        this.grade = grade;
    }

    @Override
    void display() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {

        Person p = new Person("Alice");
        Student s = new Student("Bob", 10);

        p.display();
        s.display();
    }
}