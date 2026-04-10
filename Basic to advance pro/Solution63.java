import java.sql.*;

public class Solution63 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_db";
        String user = "root";
        String password = "password";

        String query = """
            SELECT d.name AS Department,
                   e.name AS Employee,
                   e.salary AS Salary
            FROM Employee e
            JOIN Department d
            ON e.departmentId = d.id
            WHERE e.salary = (
                SELECT MAX(salary)
                FROM Employee
                WHERE departmentId = e.departmentId
            );
        """;

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                System.out.println(
                    rs.getString("Department") + " | " +
                    rs.getString("Employee") + " | " +
                    rs.getInt("Salary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}