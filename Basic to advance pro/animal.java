class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class test {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        a.sound();
        d.sound();
    }
}
