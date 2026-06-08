class Solution136 {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution136 s1 = new Solution136(); // Error

        s1.id = 101;
        s1.name = "Sai Prasad";

        s1.display();
    }
}