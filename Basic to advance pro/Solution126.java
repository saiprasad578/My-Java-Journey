class Solution126 {

    // Private variables
    private String name;
    private int age;

    // Setter methods
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Sai Prasad");
        s1.setAge(20);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}