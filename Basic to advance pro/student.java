class student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Amit";
        s.age = 20;
        s.display();
    }
}
