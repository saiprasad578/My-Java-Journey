class shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Square extends shape {
    void draw() {
        System.out.println("Drawing square");
    }
}

class Test {
    public static void main(String[] args) {
        shape[] s = {new Circle(), new Square()};
        for (shape sh : s) {
            sh.draw();
        }
    }
}
