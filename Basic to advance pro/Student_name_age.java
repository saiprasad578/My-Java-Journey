public class Student_name_age {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student_name_age src = new Student_name_age();
        src.name = "Amit";
        src.age = 20;
        src.display();
    }
}
