import java.sql.*;

public class EmployeeDAOImpl implements EmployeeDAO {

    private static final String URL =
        "jdbc:mysql://localhost:3306/practice";

    private static final String USERNAME = "root";
    private static final String PASSWORD = "radha@2008";

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
            URL, USERNAME, PASSWORD
        );
    }

    @Override
    public void addEmployee(EmployeeDb e) {

        String sql = "INSERT INTO EMPLOYEENEW VALUES(?,?,?,?,?)";

        try (Connection con = getConnection();
             PreparedStatement p = con.prepareStatement(sql)) {

            p.setInt(1, e.getId());
            p.setString(2, e.getName());
            p.setString(3, e.getEmail());
            p.setString(4, e.getDepartment());
            p.setDouble(5, e.getSalary());

            System.out.println(
                p.executeUpdate() + " employee added."
            );

        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, String email) {

        String sql = "UPDATE EMPLOYEE SET EMAIL=? WHERE ID=?";

        try (Connection con = getConnection();
             PreparedStatement p = con.prepareStatement(sql)) {

            p.setString(1, email);
            p.setInt(2, id);

            System.out.println(
                p.executeUpdate() + " employee updated."
            );

        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {

        String sql = "DELETE FROM EMPLOYEE WHERE ID=?";

        try (Connection con = getConnection();
             PreparedStatement p = con.prepareStatement(sql)) {

            p.setInt(1, id);

            System.out.println(
                p.executeUpdate() + " employee deleted."
            );

        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}