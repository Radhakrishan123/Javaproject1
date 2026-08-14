import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteEmployee {

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

    public static void deleteEmployee(int id) {

        String sql = "DELETE FROM EMPLOYEE WHERE ID = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            int rows = stmt.executeUpdate();

            System.out.println(
                     " employee deleted successfully."
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        deleteEmployee(102);
        deleteEmployee(104);

    }
}