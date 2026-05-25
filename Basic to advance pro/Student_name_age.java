public class StudentNameAge {

    String name;
    int age;

    // Constructor
    StudentNameAge(String n, int a) {
        name = n;
        age = a;
    }

    // Display method
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {

        // Creating object using constructor
        StudentNameAge student1 = new StudentNameAge("Amit", 20);

        // Calling display method
        student1.display();
    }
}