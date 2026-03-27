class shape {

    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends shape {

    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Square extends shape {

    @Override
    void draw() {
        System.out.println("Drawing square");
    }
}

public class Test {
    public static void main(String[] args) {

        shape[] shapes = { new Circle(), new Square() };

        for (shape s : shapes) {
            s.draw();  // Runtime polymorphism
        }
    }
}