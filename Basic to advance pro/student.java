class student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        student s = new student();
        s.name = "Amit";
        s.age = 20;
        s.display();
    }
}
