import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {
	
	 private static final String URL = "jdbc:mysql://localhost:3306/internship";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "radha@2008";

	    public static void main(String[] args) {

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

	            System.out.println("Connected to MySQL Successfully!");

	            Statement st = connection.createStatement();

	            // Create Table
	            String query = "CREATE TABLE IF NOT EXISTS EMPLOYEE ("
	                    + "ID INT PRIMARY KEY, "
	                    + "NAME VARCHAR(255), "
	                    + "EMAIL VARCHAR(255))";
//	            String query1= ("SELECT * FROM EMPLOYEE;");
	            		
	            

	            st.executeUpdate(query);
//	            st.executeUpdate(query1);


	            Scanner scan = new Scanner(System.in);

	            // Input
	            System.out.print("Enter Employee ID: ");
	            int id = scan.nextInt();
	            scan.nextLine(); // consume newline

	            System.out.print("Enter Employee Name: ");
	            String name = scan.nextLine();

	            System.out.print("Enter Employee Email: ");
	            String email = scan.nextLine();
	            System.out.print("Enter Employee salary: ");
	           // int salary  = scan.nextLine();

	            // Insert
	            PreparedStatement ps = connection.prepareStatement(
	                    "INSERT INTO EMPLOYEE(ID, NAME, EMAIL) VALUES(?, ?, ?)");

	            ps.setInt(1, id);
	            ps.setString(2, name);
	            ps.setString(3, email);

	            int rows = ps.executeUpdate();

	            if (rows > 0) {
	                System.out.println("\nRecord Inserted Successfully.");
	            }

	            // Display Data
	            ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEE");

	            System.out.println("\nEmployee Details");
	            System.out.println("-------------------------------");

	            while (rs.next()) {
	                System.out.println(
	                        "ID : " + rs.getInt("ID") +
	                        " | Name : " + rs.getString("NAME") +
	                        " | Email : " + rs.getString("EMAIL"));
	            }

	            rs.close();
	            ps.close();
	            st.close();
	            connection.close();
	            scan.close();

	        } catch (ClassNotFoundException e) {
	            System.out.println("Driver Not Found");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Database Error");
	            e.printStackTrace();
	        }
	    }}
