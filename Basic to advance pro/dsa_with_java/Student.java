class Student {

    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    void checkResult() {
        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Student s1 = new Student("Sai", 101, 85);
        Student s2 = new Student("Rahul", 102, 35);

        s1.display();
        s1.checkResult();

        System.out.println();

        s2.display();
        s2.checkResult();
    }
}