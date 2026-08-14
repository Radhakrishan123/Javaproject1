import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadEmployee {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "radha@2008";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Database Connected");

            Statement st = con.createStatement();

            String sql = "SELECT * FROM EMPLOYEE";

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt("ID"));
                System.out.println("Name: " + rs.getString("NAME"));
                System.out.println("Email: " + rs.getString("EMAIL"));

                System.out.println("     ");
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}