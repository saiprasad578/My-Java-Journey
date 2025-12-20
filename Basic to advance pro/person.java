class person {
    String name;
    person(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends person {
    int grade;
    Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }
    void display() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        person p = new person("Alice");
        Student s = new Student("Bob", 10);
        p.display();
        s.display();
    }
}
