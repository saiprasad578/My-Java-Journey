class animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        animal a = new animal();
        animal d = new Dog();
        a.sound();
        d.sound();
    }
}
