import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateEmployee {

    private static final String URL = "jdbc:mysql://localhost:3306/practice";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "radha@2008";

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
                URL,
                USERNAME,
                PASSWORD
        );
    }

    public static void updateEmployee(int id, String newEmail) {

        String sql = "UPDATE EMPLOYEE SET EMAIL = ? WHERE ID = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newEmail);
            stmt.setInt(2, id);

            int rows = stmt.executeUpdate();

            System.out.println(rows + " employee updated successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        updateEmployee(102, "krishna@gmail.com");
        updateEmployee(103, "easypay@gmail.com");
    }
}