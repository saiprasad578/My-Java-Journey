abstract class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract void showRole();
}

class Doctor extends Person {

    Doctor(String name, int age) {
        super(name, age);
    }

    @Override
    void showRole() {
        System.out.println(getName() + " is a Doctor.");
    }
}

class Patient extends Person {

    Patient(String name, int age) {
        super(name, age);
    }

    @Override
    void showRole() {
        System.out.println(getName() + " is a Patient.");
    }
}

public class Hospital {

    public static void main(String[] args) {

        Person doctor = new Doctor("Rahul", 35);
        Person patient = new Patient("Sai", 20);

        doctor.showRole();
        patient.showRole();
    }
}