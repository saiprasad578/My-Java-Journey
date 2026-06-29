import java.util.HashMap;

public class StudentGrades {
    public static void main(String[] args) {
        // 1. Create a HashMap
        // The first String is the Key (Student Name), the Integer is the Value (Grade)
        HashMap<String, Integer> grades = new HashMap<>();

        // 2. Add items to the HashMap using put()
        grades.put("Alice", 95);
        grades.put("Bob", 82);
        grades.put("Charlie", 88);
        grades.put("Diana", 91);

        // 3. Retrieve a value using its key with get()
        System.out.println("Alice's grade: " + grades.get("Alice"));

        // 4. Check if a key exists using containsKey()
        String searchName = "Bob";
        if (grades.containsKey(searchName)) {
            System.out.println(searchName + " is in the system with a grade of " + grades.get(searchName));
        }

        // 5. Remove an item
        grades.remove("Charlie");
        System.out.println("After removing Charlie, size of the map is: " + grades.size());

        // 6. Iterate (loop) through the HashMap
        System.out.println("\n--- All Remaining Students ---");
        for (String student : grades.keySet()) {
            System.out.println(student + ": " + grades.get(student));
        }
    }
}